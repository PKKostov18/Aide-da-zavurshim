
/*Да се напише програма, която въвежда стойности на естествените числа а, b, c и d и намира и
изважда най-големият общ делител (greatest common divisor) на числата и накрая на a и b, след това на c и d и накрая на a, b, c и d.
Указание: Използвайте функция greatest. Тялото на функцията е блок, реализираш алгоритъма на Евклид за намиране на най-големия общ делител на естествените числа и у и връща за стойност нод

Вход: Четири естествени числа.

Изход: Три числа съответно НОД(a, b), НОД(c, d) и НОД(а, b, c, d), форматирани както на примера
или "Error!" при неправилно въведени данни

- Приведете в работещ вид предоставеният по-долу програмен фрагмент.
- Програма трябва да поддържа следните функции:
- Намиране на най-голям общ делител;

Решение:
*/


import java.util.Scanner;
public class Main {
    public static int greatest(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt(); d = sc.nextInt();
        if (a < 1 || b < 1 || c < 1 || d < 1) {
            System.out.println("Error!");
            return;
        }
        System.out.println("gcd {" + a + ", " + b + "} = " + greatest(a, b));
        System.out.println("gcd {" + c + ", " + d + "} = " + greatest(c, d));
        System.out.println("gcd {" + a + ", " + b + ", " + c + ", " + d + "} = " + greatest(greatest(a, b), greatest (c, d)));

    }
}