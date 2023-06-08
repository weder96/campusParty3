package com.wsousa.campus.repository;

import com.wsousa.campus.entity.Agenda;
import org.springframework.stereotype.Component;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.util.ArrayList;
import java.util.List;
@Component
public class AgendaRepository  {
    public Agenda save(Agenda entity) {
        return entity;
    }

    public List<Agenda> findAll() {
        List<Agenda> agendas = new ArrayList<>();
        agendas.add(generatePojo());
        agendas.add(generatePojo());
        agendas.add(generatePojo());
        agendas.add(generatePojo());
        agendas.add(generatePojo());
        agendas.add(generatePojo());
        return agendas;
    }

    private Agenda generatePojo () {
        PodamFactory factory = new PodamFactoryImpl();
        Agenda myPojo = factory.manufacturePojo(Agenda.class);
        return myPojo;
    }
}
