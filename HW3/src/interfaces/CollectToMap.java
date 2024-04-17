package interfaces;

import java.util.Map;
import vacancy.Vacancy;

public interface CollectToMap<T>{

  Map<String, String> save(T object);
  void delete(T object);
  String findByName(String name);
}
