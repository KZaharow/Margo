package com.zahar.margarita.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Converter
public class DataConverter implements AttributeConverter<LocalDateTime, String> {

    public static final DateTimeFormatter FORMATER = DateTimeFormatter.ofPattern("dd.MM.yy kk:mm:ss,SSSSSS");
    public static final DateTimeFormatter FORMATER1 = DateTimeFormatter.ofPattern("dd.MM.yy");

    @Override
    public String convertToDatabaseColumn(LocalDateTime localDateTime) {
        return localDateTime.format(FORMATER);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(String s) {
        return LocalDateTime.parse(s, FORMATER);
    }
}
