package interfaces;

import java.util.List;

public interface ResumePublications {

    void createResume(String name, String phoneNumber, int salary);

    void createFullResume(String position, List<String> skills, String age, String aboutMe, String phoneNumber, int salary);
}
