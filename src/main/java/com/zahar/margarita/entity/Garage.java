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
    @NotNull
    @Min(1)
    @Max(74)
    private Long id;

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
