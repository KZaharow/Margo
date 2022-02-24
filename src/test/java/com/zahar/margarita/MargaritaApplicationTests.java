package com.zahar.margarita;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class MargaritaApplicationTests {

	@Test
	void contextLoads() {
		LocalDateTime now = LocalDate.now().atStartOfDay();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.uuuuг.");
		System.out.println(now.format(dateTimeFormatter));
	}

}
