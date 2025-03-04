package com.jeongjiho.fapp.naveremail;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jeongjiho.fapp.naveremail.NaveremailDto;

@Repository
public interface NaveremailDao {
	
	// mapper 에서 해당하는 쿼리와 연결 시켜 주고
	// 쿼리 결과를 가져옴

		public List<NaveremailDto> selectList();
		public NaveremailDto selectOne(NaveremailDto naveremailDto);
		public int insert(NaveremailDto naveremailDto);
	}

