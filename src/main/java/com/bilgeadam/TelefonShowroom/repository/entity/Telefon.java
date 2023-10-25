package com.bilgeadam.TelefonShowroom.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_telefon")
public class Telefon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double ekranBoyutu;
    BigDecimal fiyat;
    int adet;
    Long markaId;

}
