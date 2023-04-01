package ru.netology.netologyhibernate.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.netology.netologyhibernate.entity.Person;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PersonDaoImpl implements PersonDao {

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return entityManager
                .createQuery("select p from Person p where p.city_Of_living = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
