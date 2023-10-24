package com.example.gittest1.repository;

import org.springframework.stereotype.Repository;

import com.example.gittest1.mapper.DefaultImgsMapper;
import com.example.gittest1.domain.vo.DefaultImgVO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class DefaultImgsDAO {
    private final DefaultImgsMapper defaultImgsMapper;
    // 기본이미지 조회
    public DefaultImgVO findByOrder(Long defaultImgOrder){ return defaultImgsMapper.selectByOrder(defaultImgOrder); };

    // 기본 이미지 추가
    public void register(DefaultImgVO defaultImgVO){ defaultImgsMapper.insert(defaultImgVO); };

    // 기본 이미지 삭제
    public void remove(Long defaultImgId){ defaultImgsMapper.delete(defaultImgId); };

}
