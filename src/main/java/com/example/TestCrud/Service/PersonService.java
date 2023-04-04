package com.example.TestCrud.Service;

import com.example.TestCrud.Entity.Person;
import java.util.List;

public interface PersonService {

    public List<Person> SearchPerson();

    public Person CreatePerson(Person person);

    public Person ModifyPerson(Person person);

    public Person SearchPerson(int id);

    public void DeletePerson(int id);

}
