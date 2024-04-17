package hw5;

public class FifthTaskSecondPart {

  public static void main(String[] args) {

    checkDivisible(27);
    checkDivisible(39);
  }

  private static void checkDivisible(int someNumber) {
    NumberDivisible divisibleNumber = (number) -> number % 13 == 0;
    if (!divisibleNumber.checkDivisible(someNumber)) {
      System.out.printf("Переданное число %s НЕ делится без остатка на 13%n", someNumber);
    } else {
      System.out.printf("Переданное число %s делится без остатка на 13", someNumber);
    }
  }
}
