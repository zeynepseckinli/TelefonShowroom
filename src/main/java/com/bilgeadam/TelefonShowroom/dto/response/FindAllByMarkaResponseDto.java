package com.bilgeadam.TelefonShowroom.dto.response;

import com.bilgeadam.TelefonShowroom.repository.view.VwMarka;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindAllByMarkaResponseDto {
    int statusCode;
    String message;
    int currentPAge;
    boolean hasNext;
    List<VwMarka> data;
}
