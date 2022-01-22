package com.zahar.margarita.entity;

import com.zahar.margarita.converter.DataConverter;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "person1")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Person1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Convert(converter = DataConverter.class)
    private LocalDateTime birthDay;
}
