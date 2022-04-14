package com.zahar.margarita;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MargaritaApplicationTests {

    @Test
    void contextLoads() {
        LocalDateTime now = LocalDate.now().atStartOfDay();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.uuuuг.");
        System.out.println(now.format(dateTimeFormatter));
    }

    @Test
    void generate() {
        List<String> collect = Stream.generate(() -> "('2022-12-11 10:00:0%s', 'Уборка снега', 'Силами ГПК провели уборку снега %s', true)\n")
                .limit(59)
                .collect(Collectors.toList());
        for (int i = 0; i < collect.size(); i++) {
            collect.set(i, String.format(collect.get(i), i, i));
        }
        System.out.println(collect);
    }

}
