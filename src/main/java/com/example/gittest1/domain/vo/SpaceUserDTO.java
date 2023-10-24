package com.example.gittest1.domain.vo;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class SpaceUserDTO {
    private Long spaceId;
    private Long userId;
    private boolean isAdmin;
    private MultipartFile image;
    private String userNickname;
}
