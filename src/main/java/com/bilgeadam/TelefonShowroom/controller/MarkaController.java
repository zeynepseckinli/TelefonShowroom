package com.bilgeadam.TelefonShowroom.controller;

import com.bilgeadam.TelefonShowroom.dto.request.MarkaSaveRequestDto;
import com.bilgeadam.TelefonShowroom.service.MarkaService;
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
@RequestMapping(MARKA)
public class MarkaController {
    private final MarkaService markaService;


    @PostMapping(SAVE)
    public ResponseEntity<Void> saveMarka(@RequestBody @Valid MarkaSaveRequestDto dto){
        markaService.save(dto);
        return ResponseEntity.ok().build();

    }
}
