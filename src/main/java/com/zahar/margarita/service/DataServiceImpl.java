package com.zahar.margarita.service;

import com.zahar.margarita.entity.Person;
import com.zahar.margarita.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService{

    private final DataRepository dataRepository;

    @Override
    public List<Person> readPerson(LocalDateTime birthDay) {
        return dataRepository.findByBirthDay(birthDay);
    }
}
