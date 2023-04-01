package ru.netology.netologyhibernate.service;

import ru.netology.netologyhibernate.entity.Person;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.netologyhibernate.dao.PersonDao;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return personDao.getPersonsByCity(city);
    }
}
