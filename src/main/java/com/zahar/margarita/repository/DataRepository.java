package com.zahar.margarita.repository;

import com.zahar.margarita.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<Person, Long> {

    List<Person> findByBirthDay(LocalDateTime birthDay);
}
