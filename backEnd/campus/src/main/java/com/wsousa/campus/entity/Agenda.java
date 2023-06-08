package com.wsousa.campus.entity;


import jakarta.persistence.*;
import lombok.*;

;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "agenda")
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String speaker;
    private String description;
    private String community;
    private String schedule;

}
