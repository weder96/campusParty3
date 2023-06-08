package com.wsousa.campus.controller;

import com.wsousa.campus.dto.AgendaDTO;
import com.wsousa.campus.entity.Agenda;
import com.wsousa.campus.response.ResponseContent;
import com.wsousa.campus.service.AgendaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/agenda/v1")
public class AgendaController {

    private final AgendaService agendaService;

    public AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @GetMapping
    public ResponseEntity<ResponseContent<List<Agenda>>> getAgenda() {
        List<Agenda> agendas = agendaService.getAgenda();
        ResponseContent<List<Agenda>> response = new ResponseContent<>(agendas.size(), agendas);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(path = "/health")
    public ResponseEntity<ResponseContent<String>> getHealth() {
        String health = "Loading... Welcome to #CampusParty3";
        ResponseContent<String> response = new ResponseContent<>(1, health);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping(path = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseContent<Agenda>> saveAgenda(@RequestBody AgendaDTO agendaDTO) {
        Agenda agenda = agendaService.save(agendaDTO);
        ResponseContent<Agenda> response = new ResponseContent<>(1, agenda);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
