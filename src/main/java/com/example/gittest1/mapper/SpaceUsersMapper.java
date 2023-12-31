package com.example.gittest1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.gittest1.domain.vo.SpaceUserVO;

@Mapper
public interface SpaceUsersMapper {
	// 스페이스 회원 목록
	public List<SpaceUserVO> selectAll(Long spaceId, Long userId);

	// 스페이스내 내 정보 조회
	public SpaceUserVO selectById(Long spaceId, Long userId);

	// 스페이스 회원 상태 체크
	public int selectByUserAdminYn(Long spaceId, Long userId);

	// 스페이스 첫 방문 체크
	public int selectByFirst(Long spaceId, Long userId);

	// 스페이스 회원 입장 (추가)
	public void insert(SpaceUserVO spaceUserVO);

	// 스페이스 회원 탈퇴
	public void delete(Long spaceId, Long userId);

	// 스페이스 내 유저 정보 변경
	public void update(SpaceUserVO spaceUserVO);

	// 일반 회원으로 변경
	public void updateByAdminYn(Long spaceId);

	// 방장 권한 부여
	public void updateByUserId(Long spaceId, Long userId);

	// 스페이스 닉네임 중복 체크
	public int selectByNickname(Long spaceId, String userNickname);


}
