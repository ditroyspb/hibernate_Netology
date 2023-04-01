package ru.netology.netologyhibernate.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "ddl")
@NoArgsConstructor
@Getter
@Setter
public class Person {

    @EmbeddedId
    private PersonalData personalData;
    private Integer phone_number;
    private String city_Of_living;
}
