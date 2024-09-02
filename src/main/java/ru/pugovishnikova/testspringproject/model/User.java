package ru.pugovishnikova.testspringproject.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id")
    UUID id;

    @Column(name = "name")
    String name;

    @Column(name = "surname")
    String surname;

    @Column(name = "phone")
    String phone;

    @Column(name = "age")
    String age;

}
