package com.example.gittest1.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.gittest1.domain.vo.DefaultImgVO;

@Mapper
public interface DefaultImgsMapper {
    // 기본이미지 조회
    public DefaultImgVO selectByOrder(Long defaultImgOrder);

    // 기본 이미지 추가
    public void insert(DefaultImgVO defaultImgVO);

    // 기본 이미지 삭제
    public void delete(Long defaultImgId);

}
