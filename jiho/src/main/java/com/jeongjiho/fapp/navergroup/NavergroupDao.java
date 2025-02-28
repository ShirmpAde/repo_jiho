package com.jeongjiho.fapp.navergroup;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface NavergroupDao {
	public List<NavergroupDto> selectList();
}
