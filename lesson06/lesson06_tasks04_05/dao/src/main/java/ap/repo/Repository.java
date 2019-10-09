package ap.repo;

import ap.model.Animal;

public interface Repository {
  Animal get(Integer id);
  void saveOrUpdate(Animal animal);
  void remove(Animal animal);
  void remove(Integer id);
}
