package com.example.gittest1.domain.vo;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class StatusDTO {
    private int status;
    private String message;

    public StatusDTO(int status, String message){
        this.status = status;
        this.message = message;
    }
}
