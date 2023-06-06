package it.develhope.No.SQL.ORM.repositories;

import it.develhope.No.SQL.ORM.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User, String> {

}
