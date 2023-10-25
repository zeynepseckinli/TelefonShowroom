package com.bilgeadam.TelefonShowroom.controller;

import com.bilgeadam.TelefonShowroom.dto.request.TelefonSaveRequestDto;
import com.bilgeadam.TelefonShowroom.service.TelefonService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.bilgeadam.TelefonShowroom.constants.RestApi.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(TELEFON)
public class TelefonController {
    private final TelefonService telefonService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> saveTelefon(@RequestBody @Valid TelefonSaveRequestDto dto){
        telefonService.save(dto);
        return ResponseEntity.ok().build();

    }
}
