package vacancy;

 public class JobVacancy extends Vacancy<JobVacancy> {

  private String company;
  private int salary;

  public JobVacancy(String title, String description, String company, String requirements, int salary) {
    super(title, description, requirements, salary);
    this.company = company;
  }

  public void publish() {
    System.out.printf("Работная вакансии %s компании %s: %n", getVacancyTitle(), getCompany());
  }
}