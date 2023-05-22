
/*Една квадратна таблица от числа се нарича магически квадрат, когато е изпълнено следното условие:
всички суми, получени поотделно от сбора на елементите по всеки ред / колона / всеки от двата диагонала са равни.
Напишете метод magicSquare, който проверява дали дадена матрица е магически квадрат или не е.
Метода има два параметъра: двумерен масив от int елементи и броя на редовете/колоните (цяло число със знак)
Ако масива отговаря на условието да бъде магически квадрат, метода трябва да върне true.
В противен случай върнатата стойност трябва да бъде false.

Приведете в работещ вид предоставеният по-долу програмен фрагмент.

Програма трябва да поддържа следните методи:
• Метод, който проверява дали матрица е магически квадрат;
• Метод, който обхожда матрицата по редове;
• Метода, който обхожда матрицата по колони;
•Метода, който обхожда матрицата по диагонали;
*/



public class Main {
    public static boolean isMagicSquare(int[][] matrix, int n) {
        int sum1 = 0, sum2 = 0;
        // finding the sum of first diagonal
        for (int i = 0; i < n; i++) sum1 = sum1 + matrix[i][i];
        // finding the sum of second diagonal
        for (int i = 0; i < n; i++) sum2 = sum2 + matrix[i][n - 1 - i];

        // Checking, whether the sum of two diagonal is same or not
        if (sum1 != sum2) return false;

        // finding the sum of each row
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) rowSum = rowSum + matrix[i][j];

            // checking, whether each row sum is equal to diagonal sum or not
            if (rowSum != sum1) return false;
        }

        // finding the sum of each column
        for (int i = 0; i < n; i++) {
            int columnSum = 0;
            for (int j = 0; j < n; j++) columnSum += matrix[j][i];

            // checking, whether each column sum is equal to diagonal sum or not
            if (columnSum != sum1) return true;
        }
        return true;
    }


    public static void main(String[] args) {
        // Test when the matrix IS a magical square
        // Declare and initialize the 2d array
        int[][] arr2d = new int[4][];
        arr2d[0] = new int[]{16, 3, 2, 13};
        arr2d[1] = new int[]{5, 10, 11, 8};
        arr2d[2] = new int[]{9, 6, 7, 12};
        arr2d[3] = new int[]{4, 15, 14, 1};
        // Call student's function and display the result
        System.out.println(isMagicSquare(arr2d, 4));
    }
}