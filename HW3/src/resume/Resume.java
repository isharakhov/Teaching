package resume;

import interfaces.ResumePublications;
import interfaces.Search;
import java.util.ArrayList;
import java.util.List;

public class Resume implements ResumePublications, Search {

  private String position;
  private String age;
  private String aboutMe;
  private String phoneNumber;
  private int salary;
  private List<String> skills;

  public Resume(String position, String phoneNumber, int salary) {
    this.position = position;
    this.phoneNumber = phoneNumber;
    this.salary = salary;
  }

  public Resume(String position, List<String> skills, String age, String aboutMe, String phoneNumber, int salary) {
    this.position = position;
    this.skills = skills;
    this.age = age;
    this.aboutMe = aboutMe;
    this.phoneNumber = phoneNumber;
    this.salary = salary;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getAboutMe() {
    return aboutMe;
  }

  public void setAboutMe(String aboutMe) {
    this.aboutMe = aboutMe;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public boolean hasSkill(String skill) {
    return skills.contains(skill);
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public void createResume(String position, String phoneNumber, int salary) {
    this.position = position;
    this.phoneNumber = phoneNumber;
    System.out.println("Резюме на должность " + position + " опубликовано!");
  }

  @Override
  public void createFullResume(String position, List<String> skills, String age, String aboutMe, String phoneNumber, int salary) {
    this.position = position;
    this.skills = skills;
    this.age = age;
    this.aboutMe = aboutMe;
    this.phoneNumber = phoneNumber;
    System.out.println("Резюме на должность " + position + " опубликовано!");
  }

  @Override
  public void searchBySkills(List<String> requiredSkills) {
    List<String> matchingSkills = new ArrayList<>();
    for (String skill : requiredSkills) {
      if (skills.contains(skill)) {
        matchingSkills.add(skill);
      }
    }
    System.out.println("Совпадающие скиллы: " + matchingSkills);
  }
}
