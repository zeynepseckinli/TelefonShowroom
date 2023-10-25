package com.bilgeadam.TelefonShowroom.mapper;

import com.bilgeadam.TelefonShowroom.dto.request.TelefonSaveRequestDto;
import com.bilgeadam.TelefonShowroom.repository.entity.Telefon;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TelefonMapper {

    TelefonMapper INSTANCE = Mappers.getMapper(TelefonMapper.class);
    Telefon fromDto(TelefonSaveRequestDto dto);
}
