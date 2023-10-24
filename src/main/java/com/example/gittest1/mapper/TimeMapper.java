package com.example.gittest1.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TimeMapper {
	public String getTime();
}
