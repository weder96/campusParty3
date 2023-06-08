package com.wsousa.campus.service.impl;

import com.wsousa.campus.dto.AgendaDTO;
import com.wsousa.campus.entity.Agenda;
import com.wsousa.campus.mapper.AgendaMapper;
import com.wsousa.campus.repository.AgendaRepository;
import com.wsousa.campus.service.AgendaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaServiceImpl implements AgendaService {

    private final AgendaRepository agendaRepository;

    public AgendaServiceImpl(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    @Override
    public List<Agenda> getAgenda() {
        return agendaRepository.findAll();
    }

    @Override
    public Agenda save(AgendaDTO agendaDTO) {
        return agendaRepository.save(AgendaMapper.INSTANCE.toEntity(agendaDTO));
    }

}
