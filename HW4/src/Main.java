import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {

  public static void main(String[] args) {

  }

  public static boolean authorization(String login, String password, String confirmPassword) {
    try {
      if (login.length() >= 20 || !login.matches("^a-zA-Z0-9_+$")) {
        throw new WrongLoginException("Ошибка: WrongLoginException - Неверный логин!");
      }
      if (password.length() >= 20 || !password.matches("^a-zA-Z0-9_+$") || !password.equals(confirmPassword)) {
        throw new WrongPasswordException("Ошибка: WrongPasswordException - Неверный пароль!");
      }
    } catch (WrongLoginException | WrongPasswordException e) {
      System.out.println(e.getMessage());
      return false;
    }
    return true;
  }
}