package com.jeongjiho.fapp.navercompany;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jeongjiho.fapp.naveradress.NaveradressDto;

@Repository
public interface NavercompanyDao {
	
	// mapper 에서 해당하는 쿼리와 연결 시켜 주고
	// 쿼리 결과를 가져옴

		public List<NavercompanyDto> selectList();
		public NavercompanyDto selectOne(NavercompanyDto navercompanyDto);
		public int insert(NavercompanyDto navercompanyDto); 
	}
