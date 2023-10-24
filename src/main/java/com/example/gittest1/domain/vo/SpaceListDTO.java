package com.example.gittest1.domain.vo;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class SpaceListDTO {
    private Long spaceId;
    private String spaceName;
    private String spaceIconPath;
    private List<SpaceUserVO> spaceUsers;
}
