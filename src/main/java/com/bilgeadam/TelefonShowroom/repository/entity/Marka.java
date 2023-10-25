package com.bilgeadam.TelefonShowroom.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_marka")

public class Marka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String marka;
    String model;

}
