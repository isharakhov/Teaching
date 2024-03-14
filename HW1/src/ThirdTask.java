import java.util.Scanner;

public class ThirdTask {

  /**
   * В инструкции по пользованию лифтом в торговом центре написано: «Не более 6 человек или не более 450 кг».
   * Перед входом в лифт установлен прибор, который подсчитывает входящих в лифт и определяет вес до входа в лифт.
   * Прибор автоматически прекращает доступ к лифту, если вход очередного человека может нарушить инструкцию.
   * Напишите программу, которая принимает с клавиатуры значения, каждое из которых - вес очередного человека, входящего в лифт.
   * Ввод данных продолжается до тех пор, пока соблюдается требование, указанное в инструкции.
   * Программа должна выводить на экран следующую итоговую информацию:
   * • количество людей, вошедших в лифт;
   * • общий их вес;
   * • причина, по которой прекращен вход людей в лифт.
   */
  public static void main(String[] args) {
    int maxWeight = 450;
    int maxHuman = 6;
    int totalWeight = 0;
    int totalHuman = 0;
    String reason = "";
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Введите вес человека (в кг): ");
      int weight = scanner.nextInt();
      totalWeight = totalWeight + weight;
      totalHuman++;
      if (totalWeight > maxWeight) {
        reason = "Превышен максимальный вес";
        break;
      } else if (totalHuman > maxHuman) {
        reason = "Превышено максимальное количество людей";
        break;
      }
    } while (totalWeight <= maxWeight && totalHuman <= maxHuman);
    System.out.println("Количество людей в лифте : " + totalHuman);
    System.out.println("Общий вес людей в лифте: " + totalWeight);
    System.out.println("Причина прекращения доступа к лифту: " + reason);
  }
}
