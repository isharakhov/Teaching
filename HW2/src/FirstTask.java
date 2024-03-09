public class FirstTask {


  /**
   * Есть 3 вида резюме:
   * Резюме содержащее только фамилию, имя, отчество
   * Резюме содержащее фамилию, имя, отчество, возраст, профессию
   * Резюме содержащее е фамилию, имя, отчество, возраст, профессию и опыт работы в годах.
   * Реализуйте функцию getResume(), принимающую все 3 вида резюме и выводящую в консоль резюме целиком.
   */
  public static void main(String[] args) {
    String resume1 = getResume("Иванов", "Иван", "Иванович");
    String resume2 = getResume("Петров", "Петр", "Петрович", 30, "QA");
    String resume3 = getResume("Сидоров", "Сидор", "Сидорович", 30, "QAA", 5);

    System.out.println(resume1);
    System.out.println(resume2);
    System.out.println(resume3);
  }
  public static String getResume(String lastName, String firstName, String middleName) {
    return "Фамилия: " + lastName + "\nИмя: " + firstName + "\nОтчество: " + middleName + "\n";
  }
  public static String getResume(String lastName, String firstName, String middleName, int age, String profession) {
    return "Фамилия: " + lastName + "\nИмя: " + firstName + "\nОтчество: " + middleName
        + "\nВозраст: " + age + "\nПрофессия: " + profession + "\n";
  }
  public static String getResume(String lastName, String firstName, String middleName, int age, String profession, int experience) {
    return "Фамилия: " + lastName + "\nИмя: " + firstName + "\nОтчество: " + middleName
        + "\nВозраст: " + age + "\nПрофессия: " + profession + "\nОпыт работы: " + experience + "\n";
  }
}
