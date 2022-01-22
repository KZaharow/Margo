package com.zahar.margarita.service;

import com.zahar.margarita.entity.Person1;
import com.zahar.margarita.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService{

    private final DataRepository dataRepository;

    @Override
    @Transactional
    public Person1 createPerson(){
        Person1 person1 = new Person1();
        person1.setName("user");
        person1.setBirthDay(LocalDateTime.now());
        return dataRepository.save(person1);
    }

    @Override
    public List<Person1> readAllPerson() {
        return dataRepository.findAll();
    }

    @Override
    public List<Person1> readAllPersonInDateRange(LocalDateTime start, LocalDateTime end) {
        return dataRepository.findAllByBirthDayBetween(start,end);
    }

    @Override
    public List<Person1> readPerson(LocalDateTime birthDay) {
        return dataRepository.findByBirthDay(birthDay);
    }
}
