package com.example.TestCrud.Controller;

import com.example.TestCrud.Entity.Person;
import com.example.TestCrud.Service.PersonServiceIMPL.PersonIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("PersonRepository")
public class PersonController {

    @Autowired
    private PersonIMPL impl;

    @GetMapping
    @RequestMapping(value = "SearchPerson", method = RequestMethod.GET)
    public ResponseEntity<?> SearchPerson(){
        List<Person> listPerson = this.impl.SearchPerson();
        return ResponseEntity.ok(listPerson);
    }

    @PostMapping
    @RequestMapping(value = "CreatePerson", method = RequestMethod.POST)
    public ResponseEntity<?> CreatePerson(@RequestBody Person person){
        Person personCreated = this.impl.CreatePerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(personCreated);

    }

    @PutMapping
    @RequestMapping(value = "ModifyPerson", method = RequestMethod.PUT)
    public ResponseEntity<?> ModifyPerson(@RequestBody Person person){
        Person personModify = this.impl.ModifyPerson(person) ;
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(personModify);

    }

    @GetMapping
    @RequestMapping(value = "SearchPerson/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> SearchOnePerson(@PathVariable int id){
        Person person = this.impl.SearchPerson(id);
        return ResponseEntity.ok(person);
    }

    @DeleteMapping
    @RequestMapping(value = "DeletePerson/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> DeletePerson(@PathVariable int id){
        this.impl.DeletePerson(id);
        return ResponseEntity.ok().build();
    }
}
