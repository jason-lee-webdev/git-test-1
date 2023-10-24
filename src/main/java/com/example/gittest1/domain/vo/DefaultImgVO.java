package com.example.gittest1.domain.vo;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class DefaultImgVO {
    private String defaultImgRegisterDate;
    private String defaultImgName;
    private String defaultImgPath;
    private String defaultImgUuid;
    private Long defaultImgSize;
    private Long defaultImgOrder;
}
