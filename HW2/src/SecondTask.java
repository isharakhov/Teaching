public class SecondTask {

  /**
   * Задан массив чисел A. Разработать рекурсивную функцию, которая находит сумму элементов массива.
   * При решении этой задачи нельзя использовать строки, списки, циклы. Разрешена только рекурсия и целочисленная арифметика.
   */
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
    int sum = sumArray(arr, 0);
    System.out.println("Сумма элементов массива: " + sum);
  }

  public static int sumArray(int[] arr, int index) {
    if (index == arr.length) {
      return 0;
    }
    return arr[index] + sumArray(arr, index + 1);
  }
}