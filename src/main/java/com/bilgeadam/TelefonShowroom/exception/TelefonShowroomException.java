package com.bilgeadam.TelefonShowroom.exception;

import lombok.Getter;

@Getter
public class TelefonShowroomException extends RuntimeException{
    private final ErrorType errorType;

    public TelefonShowroomException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }
    public TelefonShowroomException(ErrorType errorType, String message){
        super(message);
        this.errorType=errorType;
    }
}
