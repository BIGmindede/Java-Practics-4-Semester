package ru.khitrov.javapracs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.khitrov.javapracs.models.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Integer> {

}
