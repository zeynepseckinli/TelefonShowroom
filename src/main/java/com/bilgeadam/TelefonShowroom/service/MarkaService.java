package com.bilgeadam.TelefonShowroom.service;

import com.bilgeadam.TelefonShowroom.dto.request.MarkaSaveRequestDto;
import com.bilgeadam.TelefonShowroom.mapper.MarkaMapper;
import com.bilgeadam.TelefonShowroom.repository.MarkaRepository;
import com.bilgeadam.TelefonShowroom.repository.entity.Marka;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarkaService {
    private final MarkaRepository repository;

    public void save(MarkaSaveRequestDto dto) {
        Marka marka=MarkaMapper.INSTANCE.markaFromDto(dto);
        repository.save(marka);
    }
}
