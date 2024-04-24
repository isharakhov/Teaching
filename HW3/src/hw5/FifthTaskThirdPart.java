package hw5;

public class FifthTaskThirdPart {

  public static void main(String[] args) {
    DiscriminantCalculator calculator = (a, b, c) -> (b * b) - (4 * a * c);

    double a = 1.5;
    double b = 2.7;
    double c = 3.0;
    System.out.println("Дискриминант переданных чисел равен = " + calculator.calculateDiscriminant(a, b, c));
  }
}
