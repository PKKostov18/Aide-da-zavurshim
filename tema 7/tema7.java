/*Реализирайте програма на JAVA, която сортира във възходящ ред вектор от цели числа. Сортирайте чрез метода на мехурчето.

Приведете в работещ вид предоставения по-долу програмен фрагмент.

В кода има сгрешени и липсващи фрагменти. */



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static List<Integer> inputElementList(int size) {
        List<Integer> resultList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            resultList.add(element);
        }
        return resultList;
    }

    public static void print(List<Integer> v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(v.get(i) + " ");
        }
        System.out.println();
    }

    public static List<Integer> bubbleSort(List<Integer> v, int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (v.get(j) > v.get(j + 1)) {
                    temp = v.get(j);
                    v.set(j, v.get(j + 1));
                    v.set(j + 1, temp);
                }
            }
        }
        return v;
    }

    public static void main(String[] args) {
        List<Integer> v1;
        List<Integer> v2 = new ArrayList<>();
        List<Integer> vSort;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        v1 = inputElementList(n);

        for (int i = 0; i < n; i++) {
            if (v1.get(i) >= 0) {
                v2.add(v1.get(i));
            }
        }

        vSort = bubbleSort(v1, n);
        print(vSort, n);
    }
}
