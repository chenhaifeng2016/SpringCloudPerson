package com.example;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenh on 2017/5/2.
 */
@RestController
public class PersonController {

    List<Person> people = new ArrayList<Person>();

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Person> savePerson(@RequestBody String personName){
        Person person = new Person();
        person.setName(personName);


        people.add(person);

        return people;
    }
}
