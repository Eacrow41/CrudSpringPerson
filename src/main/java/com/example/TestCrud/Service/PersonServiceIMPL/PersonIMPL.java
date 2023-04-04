package com.example.TestCrud.Service.PersonServiceIMPL;

import com.example.TestCrud.Entity.Person;
import com.example.TestCrud.Repository.PersonRepository;
import com.example.TestCrud.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonIMPL  implements PersonService {


    @Autowired
    private PersonRepository repository;

    @Override
    public List<Person> SearchPerson() {
        return (List<Person>)this.repository.findAll();
    }

    @Override
    public Person CreatePerson(Person person) {
        person.setEmail(person.getEmail());
        return this.repository.save(person);
    }

    @Override
    public Person ModifyPerson(Person person) {
        return this.repository.save(person);
    }

    @Override
    public Person SearchPerson(int id) {
        return this.repository.findById(id).get();
    }

    @Override
    public void DeletePerson(int id) {
        this.repository.deleteById(id);
    }
}
