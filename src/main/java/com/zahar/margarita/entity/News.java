package com.zahar.margarita.entity;

import com.zahar.margarita.status.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    @DateTimeFormat(pattern="dd-MMM-YYYY")
    private LocalDateTime date;

    @Column(name = "header")
    private String header;

    @Column(name = "text", length = 2000)
    private String text;

    @Column(name = "status")
    private boolean status;
}
