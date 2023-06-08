package com.wsousa.campus.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AgendaDTO {

    private Long id;
    private String title;
    private String speaker;
    private String description;
    private String community;
    private String schedule;
}
