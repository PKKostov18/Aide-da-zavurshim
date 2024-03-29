import java.util.function.BiConsumer;

public class Main {

  public static void add(int a, int b) {
    int sum = a + b;
    System.out.printf("%d + %d = %d%n", a, b, sum);
  }

  public static void sub(int a, int b) {
    int sum = a - b;
    System.out.printf("%d - %d = %d%n", a, b, sum);
  }

  public static void mul(int a, int b) {
    int sum = a * b;
    System.out.printf("%d * %d = %d%n", a, b, sum);
  }

  public static void div(int a, int b) {
    int sum = a / b;
    System.out.printf("%d / %d = %d%n", a, b, sum);
  }

  public static void main(String[] args) {
    BiConsumer<Integer, Integer> d = Main::add;
    d = d.andThen(Main::sub);
    d = d.andThen(Main::mul);
    d = d.andThen(Main::div);

    d.accept(1, 5);
  }
}
