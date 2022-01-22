package com.zahar.margarita.controller;

import com.zahar.margarita.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DataController {

    private final DataService dataService;

    @GetMapping("/{start}/{monthDeep}")
    public String getData(
            @PathVariable("start") @DateTimeFormat(pattern = "dd.MM.yy kk:mm:ss,SSSSSS") LocalDateTime start,
            @PathVariable("monthDeep") long deepMonth
    ) {
        return dataService.readAllPersonInDateRange(start, start.plusMonths(deepMonth))
                .toString();
    }

    @GetMapping("/all")
    public String getAllData() {
        return dataService.readAllPerson().toString();
    }
}
