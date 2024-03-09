package employer;

import resume.Resume;
import vacancy.Vacancy;

public class Company extends Employer {

  private String region;
  private int numberOfWorkers;

  public Company(String employerName, String companyName, String aboutCompany, String region, int numberOfWorkers) {
    super(employerName, companyName, aboutCompany);
    this.numberOfWorkers = numberOfWorkers;
    this.region = region;
  }

  public String getRegion() {
    return region;
  }

  public int getNumberOfWorkers() {
    return numberOfWorkers;
  }

  @Override
  public void hireApplicant(Vacancy vacancy, Resume resume) {
    if (resume.getSkills().contains(vacancy.getRequirements()) && resume.getSalary() <= vacancy.getSalary()) {
      System.out.println("Здравствуйте " + resume.getPhoneNumber() + ".\nМы компания - " + getCompanyName()
          + " нанимаем вас на работу, на позицию " + vacancy.getVacancyTitle());
      numberOfWorkers++;
    } else {
      System.out.println("Мы вам перезвоним!");
    }
  }

  @Override
  public void aboutUs() {
    System.out.println("О нас\nКомпания - " + getCompanyName() +
        "\n Работает в регионе - " + getRegion() + " вот уже много много лет" +
        "\nПодробнее о нас:\n" + getAboutCompany());
  }
}
