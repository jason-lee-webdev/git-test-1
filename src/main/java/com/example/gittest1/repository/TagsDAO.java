package com.example.gittest1.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.gittest1.mapper.TagsMapper;
import com.example.gittest1.domain.vo.TagVO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class TagsDAO {
	private final TagsMapper tagsMapper;
	// 스페이스 태그 목록
	public List<TagVO> findAll(Long spaceId){ return tagsMapper.selectAll(spaceId); };

	// 스페이스 태그 추가
	public void save(TagVO tagVO){ tagsMapper.insert(tagVO); };

	// 스페이스 태그 개수
	public int getTagCnt(Long spaceId){ return tagsMapper.getTagCnt(spaceId); };

	// 스페이스 태그 삭제
	public void delete(Long tagId){ tagsMapper.delete(tagId); };
}
