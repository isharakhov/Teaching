public class SecondTask {

  /**
   * Напишите программу, которая выводит на экран все трехзначные числа, для которых соблюдаются два условия:
   * • само число заканчивается на 0;
   * • сумма нечетных делителей этого числа тоже заканчивается на 0.
   */
  public static void main(String[] args) {

    for (int i = 100; i < 1000; i++) {
      if (i % 10 == 0) {
        int sum = 0;
        for (int j = 1; j <= i; j = j + 2) {
          if (i % j == 0) {
            sum = sum + j;
          }
        }
        if (sum % 10 == 0) {
          System.out.println(i);
        }
      }
    }
  }
}
