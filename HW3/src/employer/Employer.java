package employer;

import resume.Resume;
import vacancy.Vacancy;

public abstract class Employer {

  private int employerId;
  private String employerName;
  private String companyName;
  private String aboutCompany;
  private static int counter = 0;

  public Employer(String employerName, String companyName, String aboutCompany) {
    this.employerName = employerName;
    this.companyName = companyName;
    this.aboutCompany = aboutCompany;
    this.employerId = ++counter;
  }

  public int getEmployerId() {
    return employerId;
  }

  public String getEmployerName() {
    return employerName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getAboutCompany() {
    return aboutCompany;
  }

  public static int getCounter() {
    return counter;
  }

  public abstract void hireApplicant(Vacancy vacancy, Resume resume);
  public abstract void aboutUs();
}
