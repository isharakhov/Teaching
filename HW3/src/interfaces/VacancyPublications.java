package interfaces;

public interface VacancyPublications {

  void publishShortVacancy(String vacancyTitle, String vacancyDescription, int salary);

  void publishFullVacancy(String vacancyTitle, String vacancyDescription, String requirements, int salary);
}
