import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourthTask {

  /**
   * Напишите программу, которая формирует два массива (не обязательно одинакового размера) целых чисел.
   * Программа возвращает массив значений, которые присутствуют в первом массиве, но не присутствуют во втором.
   */
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {6, 7, 1, 4};
    findSameNumbers(array1, array2);
  }

  public static void findSameNumbers(int[] array1, int[] array2) {
    List<Integer> sameNumbers = new ArrayList<>();
    boolean isSame;
    for (int number : array1) {
      isSame = true;
      for (int value : array2) {
        if (number == value) {
          isSame = false;
          break;
        }
      }
      if (isSame) {
        sameNumbers.add(number);
      }
    }
    int[] result = new int[sameNumbers.size()];
    for (int i = 0; i < sameNumbers.size(); i++) {
      result[i] = sameNumbers.get(i);
    }
      System.out.print("Значения которые присутствуют в первом массиве, но не присутствуют во втором массиве: " + Arrays.toString(result));
  }
}
