package com.wsousa.campus.mapper;

import com.wsousa.campus.dto.AgendaDTO;
import com.wsousa.campus.entity.Agenda;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AgendaMapper {
    AgendaMapper INSTANCE = Mappers.getMapper(AgendaMapper.class);

    public AgendaDTO toDTO (Agenda agenda);
    public Agenda toEntity(AgendaDTO agendaDTO);

}
