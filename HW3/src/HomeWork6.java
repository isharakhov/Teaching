import java.util.ArrayList;
import java.util.List;
import resume.Resume;
import vacancy.JobVacancy;
import vacancy.Vacancy;

public class HomeWork6 {

  public static void main(String[] args) {
    List<Vacancy> vacancies = new ArrayList<>();
    vacancies.add(new Vacancy("Java developer",
        "Ищем java разработчика, который согласиться работать за еду", "Java, Spring, Hibernate", 0));
    vacancies.add(new Vacancy("Frontend Developer",
        "Нужен Frontend developer", "JavaScript, HTML, CSS, React", 1000));
    vacancies.add(new JobVacancy("Frontend developer в рабство",
        "Frontend developer", "Арбузы и Дыни", "JavaScript, HTML, CSS, React", 0));

    List<Resume> resumes = new ArrayList<>();
    resumes.add(new Resume("Java developer", "89995678412", 350000));
    resumes.add(new Resume("Java developer на удаленку",
        List.of("Java, Git, Spring, Hibernate, Docker, Kubernetes"), "36",
        "Люблю работать и причем работать много, так что нанять меня будет в ваших интересах", "89213321123", 5000000));
    resumes.add(new Resume("Любая", "666-666", 300000));

    System.out.println("Вакансии которые подходят по скиллу:\n");
    checkVacanciesBySkill(vacancies, "Java");

    String position = "Java Developer";
    System.out.printf("\nРезюме которые подходят на позицию %s:%n", position);
    checkResumesByVacancy(resumes, position);

    improveJavaVacancies(vacancies);

    removeBlankResumes(resumes);
  }

  public static void checkVacanciesBySkill(List<Vacancy> vacancies, String skill) {
    vacancies.stream()
        .filter(vacancy -> vacancy.getRequirements().contains(skill))
        .forEach(System.out::println);
    }

  public static void checkResumesByVacancy(List<Resume> resumes, String vacancyName) {
     resumes.stream()
        .filter(r -> r.getPosition().contains(vacancyName) && r.getSalary() < 400000)
        .forEach(System.out::println);
  }

  public static void improveJavaVacancies(List<Vacancy> vacancies) {
    vacancies.stream()
        .filter(vacancy -> vacancy.getRequirements().contains("Java"))
        .peek(vacancy -> vacancy.setVacancyDescription(vacancy.getVacancyDescription()+ "Мы предлагаем:\n" +
            "\n" +
            "работа в ИТ-аккредитованной компании;\n" +
            "удалённый формат работы на территории РФ ;\n" +
            "гибкий график работы;\n" +
            "оформление с первого рабочего дня, полное соблюдение ТК РФ;\n" +
            "интересные, амбициозные задачи с достижимым результатом, понятным заказчиком и продуктом;\n" +
            "\n" +
            "достаточную свободу действий, инструментарий и необходимые ресурсы;\n" +
            "\n" +
            "регулярное обучение и профильные конференции, современное оборудование для работы."))
        .forEach(System.out::println);
  }

  public static void removeBlankResumes(List<Resume> resumes) {
    int size = resumes.size();
    resumes.removeIf(resume -> resume.getAboutMe() == null || resume.getAboutMe().isEmpty());
    int newSize = resumes.size();
    System.out.println("После фильтрации резюме осталось " + newSize + " из " + size + ", вот они:\n" +
        resumes.stream()
            .map(Resume::getPosition)
            .toList()
    );
  }
}
