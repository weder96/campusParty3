package com.wsousa.campus.entity;


import lombok.*;

;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agenda {

    private Long id;
    private String title;
    private String speaker;
    private String description;
    private String community;
    private String schedule;

}
