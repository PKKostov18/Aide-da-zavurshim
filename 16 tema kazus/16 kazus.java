/*Напишете програма на С++, която решава определени системи от линейни уравнения по метода на Гаус. Коефициентите и решенията са реални числа. Решенията трябва да бъдат закръглени до 3-ти знак след десетичната точка. Използвайте манипулатора 

cout << setprecision(3) << fixed; */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[][] a = new float[10][10];
        float[] x = new float[10];
        float ratio;
        int i, j, k, n;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n + 1; j++) {
                a[i][j] = input.nextFloat();
            }
        }

        for (i = 1; i <= n - 1; i++) {
            if (a[i][i] == 0.0) {
                System.out.println("Mathematical Error!");
                return;
            } else {
                for (j = i + 1; j <= n; j++) {
                    ratio = a[j][i] / a[i][i];
                    for (k = 1; k <= n + 1; k++) {
                        a[j][k] = a[j][k] - ratio * a[i][k];
                    }
                }
            }
        }
        /* Obtaining Solution by Back Substitution Method */
        x[n] = a[n][n + 1] / a[n][n];

        for (i = n - 1; i >= 1; i--) {
            x[i] = a[i][n + 1];
            for (j = i + 1; j <= n; j++) {
                x[i] = x[i] - a[i][j] * x[j];
            }
            x[i] = x[i] / a[i][i];
        }

        /* Displaying Solution */
        for (i = 1; i <= n; i++) {
            System.out.printf("%.3f\n", x[i]);
        }
    }
}