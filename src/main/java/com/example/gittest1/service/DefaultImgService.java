package com.example.gittest1.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.gittest1.exceptions.CustomException;
import com.example.gittest1.exceptions.StatusCode;
import com.example.gittest1.repository.DefaultImgsDAO;
import com.example.gittest1.domain.vo.DefaultImgVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class DefaultImgService {
    private final DefaultImgsDAO defaultImgsDAO;

    public DefaultImgVO defaultImgData(Long defaultImgOrder){
        return defaultImgsDAO.findByOrder(defaultImgOrder);
    };

    @Transactional(rollbackFor = Exception.class)
    public void register(DefaultImgVO defaultImgVO){
        try{
            defaultImgsDAO.register(defaultImgVO);
        } catch (Exception e) {
            throw new CustomException(StatusCode.BAD_REQUEST);
        }
    }

    public void remove(Long defaultImgId){
        try{
            defaultImgsDAO.remove(defaultImgId);
        } catch (Exception e) {
            throw new CustomException(StatusCode.BAD_REQUEST);
        }
    }
}
