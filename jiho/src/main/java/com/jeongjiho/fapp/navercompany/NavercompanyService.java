package com.jeongjiho.fapp.navercompany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavercompanyService {
	// 로직을 정의 하는 부분

	// 여러건의 데이터를 가지고 온다.
		
//		mapper 에서 해당하는 쿼리와 연결 시켜 줌
//	 	쿼리 결과를 가져옴
		
		@Autowired
		NavercompanyDao navercompanyDao;
//		NaverhompageDao naverhompage = new NaverhompageDao(); 
		
//		public List<NaverhompageDto> selectList(){
//			List<NaverhompageDto> naverhompageDtos = new ArrayList<>();
//			
//			naverhompageDtos = naverhompageDao.selectList();
//			
//			return naverhompageDtos;
//		}	
		
		public List<NavercompanyDto> selectList(){
			return navercompanyDao.selectList();
		}
	}

