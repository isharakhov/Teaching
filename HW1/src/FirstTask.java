import java.util.Scanner;

public class FirstTask {

  /**
   * Напишите программу, которая принимает с клавиатуры целое трехзначное положительное число и изменяет его следующим образом:
   * • для чисел, больших 500, - переставляет местами числа единиц и сотен (вместо 672 - 276);
   * • в остальных числах переставляются местами числа десятков и единиц (вместо 363 - 336).
   * Программа должна вывести на экран новое значение переменной.
   */
  public static void main(String[] args) {
    int fullNumber;
    int[] digits = new int[3];
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите целое трехзначное положительное число: ");
    fullNumber = scanner.nextShort();
    digits[0] = fullNumber / 100;
    digits[1] = (fullNumber / 10) % 10;
    digits[2] = fullNumber % 10;

    if (fullNumber > 500) {
      int hundreds = digits[0];
      digits[0] = digits[2];
      digits[2] = hundreds;
    } else {
      int tens = digits[1];
      digits[1] = digits[2];
      digits[2] = tens;
    }
    System.out.println("Измененное число будет: " + digits[0] + digits[1] + digits[2]);
  }
}
