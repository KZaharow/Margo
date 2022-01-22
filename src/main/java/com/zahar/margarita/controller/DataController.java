package com.zahar.margarita.controller;

import com.zahar.margarita.service.DataService;
import com.zahar.margarita.service.DataServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DataController {

    private final DataService dataService;
    @GetMapping
    public String getData(){

        //return dataService.createPerson().toString();
        //return dataService.readPerson(LocalDateTime.now()).toString();
        //return dataService.readAllPerson().toString();
        return dataService.readAllPersonInDateRange(LocalDateTime.now().minusDays(1000),LocalDateTime.now())
                .toString();
    }
}
