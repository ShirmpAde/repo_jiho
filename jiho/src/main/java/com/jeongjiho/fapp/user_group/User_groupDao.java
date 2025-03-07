package com.jeongjiho.fapp.user_group;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface User_groupDao {

	public List<User_groupDto> selectList();
	public User_groupDto selectOne(User_groupDto user_groupDto);
	public int insert(User_groupDto user_groupDto);
	public int update(User_groupDto user_groupDto);
	public int delete(User_groupDto user_groupDto);
	public int uelete(User_groupDto user_groupDto);
}
