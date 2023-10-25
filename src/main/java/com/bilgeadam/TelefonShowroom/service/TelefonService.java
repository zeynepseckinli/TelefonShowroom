package com.bilgeadam.TelefonShowroom.service;

import com.bilgeadam.TelefonShowroom.dto.request.TelefonSaveRequestDto;
import com.bilgeadam.TelefonShowroom.mapper.TelefonMapper;
import com.bilgeadam.TelefonShowroom.repository.MarkaRepository;
import com.bilgeadam.TelefonShowroom.repository.TelefonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TelefonService {
    private final TelefonRepository repository;

    public void save(TelefonSaveRequestDto dto) {
        repository.save(
                TelefonMapper.INSTANCE.fromDto(dto)
        );

    }
}
