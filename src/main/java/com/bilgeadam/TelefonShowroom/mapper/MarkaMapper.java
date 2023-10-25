package com.bilgeadam.TelefonShowroom.mapper;

import com.bilgeadam.TelefonShowroom.dto.request.MarkaSaveRequestDto;
import com.bilgeadam.TelefonShowroom.dto.request.TelefonSaveRequestDto;
import com.bilgeadam.TelefonShowroom.repository.entity.Marka;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface MarkaMapper {
    MarkaMapper INSTANCE = Mappers.getMapper(MarkaMapper.class);
    Marka markaFromDto(MarkaSaveRequestDto dto);
}
