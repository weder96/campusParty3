package com.wsousa.campus.service;

import com.wsousa.campus.dto.AgendaDTO;
import com.wsousa.campus.entity.Agenda;

import java.util.List;

public interface AgendaService {
    List<Agenda> getAgenda();


    Agenda save(AgendaDTO agendaDTO);
}
