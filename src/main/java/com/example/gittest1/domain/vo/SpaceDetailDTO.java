package com.example.gittest1.domain.vo;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class SpaceDetailDTO {
    private String spaceName;
    private String spaceDescription;
    private String spaceIconPath;
    private String spacePw;
    private int isAdmin;
    private int isFirst;
    private List<SpaceUserVO> spaceUsers;
    private List<TagVO> tags;
}
