package com.bilgeadam.TelefonShowroom.repository.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VwMarka {
    String marka;
    String model;
    Long telefonId;

}
