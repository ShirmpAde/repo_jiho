package com.jeongjiho.fapp.naversns;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface NaversnsDao {

	public List<NaversnsDto> selectList();
	public NaversnsDto selectOne(NaversnsDto naversnsDto);
	public int insert(NaversnsDto naversnsDto);
}
