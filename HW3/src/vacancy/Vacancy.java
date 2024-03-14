package vacancy;

import employer.Company;
import interfaces.Information;
import interfaces.VacancyPublications;

public class Vacancy implements VacancyPublications, Information {

  private Company company;
  private String vacancyTitle;
  private String vacancyDescription;
  private String requirements;
  private int vacancyCount;
  private int salary;

  public Vacancy(String vacancyTitle, String vacancyDescription, String requirements, int salary) {
    this.vacancyTitle = vacancyTitle;
    this.vacancyDescription = vacancyDescription;
    this.requirements = requirements;
    this.salary = salary;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public String getVacancyTitle() {
    return vacancyTitle;
  }

  public void setVacancyTitle(String vacancyTitle) {
    this.vacancyTitle = vacancyTitle;
  }

  public String getVacancyDescription() {
    return vacancyDescription;
  }

  public void setVacancyDescription(String vacancyDescription) {
    this.vacancyDescription = vacancyDescription;
  }

  public String getRequirements() {
    return requirements;
  }

  public void setRequirements(String requirements) {
    this.requirements = requirements;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getVacancyCount() {
    return vacancyCount;
  }

  public void setVacancyCount(int vacancyCount) {
    this.vacancyCount = vacancyCount;
  }

  @Override
  public void publishShortVacancy(String vacancyTitle, String vacancyDescription, int salary) {
    this.vacancyTitle = vacancyTitle;
    this.vacancyDescription = vacancyDescription;
    System.out.println("Вакансия " + vacancyTitle + " опубликована!");
    vacancyCount++;
  }

  @Override
  public void publishFullVacancy(String vacancyTitle, String vacancyDescription, String requirements, int salary) {
    this.vacancyTitle = vacancyTitle;
    this.vacancyDescription = vacancyDescription;
    this.requirements = requirements;
    System.out.println("Вакансия " + vacancyTitle + " c требованиями:\n" + requirements + "\nразмещена");
    vacancyCount++;
  }

  @Override
  public void getInfo() {
    System.out.println("Вакансия - " + getVacancyTitle() +"\nЗарплата - " + getSalary() + "\nТребования - " + getRequirements());
  }
}
