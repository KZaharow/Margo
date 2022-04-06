package com.zahar.margarita.entity;

import com.zahar.margarita.roles.Roles;
import com.zahar.margarita.status.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String firstName;

    @Column(name = "surname")
    private String lastName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "passport")
    private String passport;

    @OneToMany(mappedBy = "garage")
    private Set<Garage> garages;

    @Column(name = "address_1")
    private String address1;

    @Column(name = "address_2")
    private String address2;

    @Column(name = "hired_date")
    private LocalDate hiredDate;

    @Column(name = "hired_document")
    private String hiredDocument;

    @Column(name = "fired_date")
    private LocalDate firedDate;

    @Column(name = "fired_document")
    private String firedDocument;

    @Column(name = "is_benefit_person")
    private boolean isBenefitPerson;

    @Column(name = "benefit_document")
    private String firedDocument;


    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    private Roles roles;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private Status status;
}
