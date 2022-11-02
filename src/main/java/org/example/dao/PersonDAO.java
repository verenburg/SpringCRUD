package org.example.dao;

import org.example.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;


    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Anton"));
        people.add(new Person(++PEOPLE_COUNT, "Sergey"));
        people.add(new Person(++PEOPLE_COUNT, "Misha"));
        people.add(new Person(++PEOPLE_COUNT, "Anastasia"));

    }

    public List<Person> showAll() {
        return  people;
    }

    public Person showById(int id) {
        return  people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
