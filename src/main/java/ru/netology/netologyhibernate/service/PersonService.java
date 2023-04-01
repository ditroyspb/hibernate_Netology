package ru.netology.netologyhibernate.service;

import ru.netology.netologyhibernate.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> getPersonsByCity(String city);
}
