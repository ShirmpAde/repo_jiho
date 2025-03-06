package com.jeongjiho.fapp.naverbirthday;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jeongjiho.fapp.naveradress.NaveradressDto;

@Repository
public interface NaverbirthdayDao {

	// mapper 에서 해당하는 쿼리와 연결 시켜 주고
	// 쿼리 결과를 가져옴

		public List<NaverbirthdayDto> selectList();
		public NaverbirthdayDto selectOne(NaverbirthdayDto naverbirthdayDto);
		public int insert(NaverbirthdayDto naverbirthdayDto);
}
