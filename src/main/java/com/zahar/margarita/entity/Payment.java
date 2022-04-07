package com.zahar.margarita.entity;

import com.zahar.margarita.status.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @OneToOne
    @JoinColumn(name = "garage_id")
    private Garage garage;

    @Column(name = "text")
    private String text;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private Status status;
}
