package helloUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Spring Data JPA CRUD Repository is a feature of Spring Data JPA that I extensively use. Using it, you can just define an interface that extends CrudRepository
to manage entities for most common operations, such as saving an entity, updating it, deleting it, or finding it by id. Spring Data JPA uses generics and reflection
* to generate the concrete implementation of the interface we define.*/

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
}