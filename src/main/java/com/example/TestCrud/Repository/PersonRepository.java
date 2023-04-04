package com.example.TestCrud.Repository;

import com.example.TestCrud.Entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository  extends CrudRepository<Person,Integer> {
}
