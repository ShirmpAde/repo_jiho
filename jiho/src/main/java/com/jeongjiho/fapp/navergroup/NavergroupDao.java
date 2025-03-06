package com.jeongjiho.fapp.navergroup;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface NavergroupDao {

	public List<NavergroupDto> selectList();
	public NavergroupDto selectOne(NavergroupDto navergroupDto);
	public int insert(NavergroupDto navergroupDto);
}
