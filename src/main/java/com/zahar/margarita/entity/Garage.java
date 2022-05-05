package com.zahar.margarita.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Garage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    @Min(1)
    private Long number;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Person owner;

    @Column(name = "isPrivate")
    private boolean isPrivate;

    @Column(name = "square")
    private Double square;

    @Column(name = "description")
    private String description;
}
