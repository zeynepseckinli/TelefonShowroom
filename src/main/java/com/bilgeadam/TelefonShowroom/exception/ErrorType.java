package com.bilgeadam.TelefonShowroom.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;



@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {


    BAD_REQUEST_ERROR(3001,"Girilen bilgiler hatalı, kontrol ederek tekrar giriniz",HttpStatus.BAD_REQUEST),
    TUR_ERROR(1002,"Telfon modeli bulunamadı", HttpStatus.BAD_REQUEST);

    private int code;
    private String message;
    private HttpStatus httpStatus;
}
