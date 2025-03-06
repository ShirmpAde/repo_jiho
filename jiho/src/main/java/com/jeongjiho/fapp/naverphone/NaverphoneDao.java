package com.jeongjiho.fapp.naverphone;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface NaverphoneDao {

	public List<NaverphoneDto> selectList();
	public NaverphoneDto selectOne(NaverphoneDto naverphoneDto);
	public int insert(NaverphoneDto naverphoneDto);
}