package com.zahar.margarita.repository;

import com.zahar.margarita.entity.Person1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<Person1, Long> {

    List<Person1> findByBirthDay(LocalDateTime birthDay);
    List<Person1> findAllByBirthDayBetween(LocalDateTime start, LocalDateTime end);

}
