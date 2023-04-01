package ru.netology.netologyhibernate.dao;

import ru.netology.netologyhibernate.entity.Person;

import java.util.List;

public interface PersonDao {

    List<Person> getPersonsByCity(String city);
}
