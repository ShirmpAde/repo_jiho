package com.jeongjiho.fapp.navercompany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeongjiho.fapp.naveradress.NaveradressDto;

@Service
public class NavercompanyService {
		
		@Autowired
		NavercompanyDao navercompanyDao;

		
		public List<NavercompanyDto> selectList(){
			return navercompanyDao.selectList();
		}
		public Object selectOne(NavercompanyDto navercompanyDto) {
			return navercompanyDao.selectOne(navercompanyDto);
		}
		
		public int insert(NavercompanyDto navercompanyDto) {
			return navercompanyDao.insert(navercompanyDto);
		}
	}

