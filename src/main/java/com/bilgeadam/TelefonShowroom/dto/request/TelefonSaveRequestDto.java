package com.bilgeadam.TelefonShowroom.dto.request;

import com.bilgeadam.TelefonShowroom.repository.entity.Marka;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefonSaveRequestDto {
    @NotNull
    @NotBlank
    Double ekranBoyutu;
    @NotNull
    @NotBlank
    BigDecimal fiyat;
    @NotNull
    @NotBlank
    int adet;
    @NotNull
    @NotBlank
    Long markaId;
    @NotNull
    @NotBlank
    String model;

}
