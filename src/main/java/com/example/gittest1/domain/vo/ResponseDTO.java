package com.example.gittest1.domain.vo;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class ResponseDTO {
    private int status;
    private String message;

    public ResponseDTO(int status, String message){
        this.status = status;
        this.message = message;
    }
}
