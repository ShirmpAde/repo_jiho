package com.jeongjiho.fapp.naverphone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaverphoneService {

	@Autowired
	NaverphoneDao naverphoneDao;
//	NaverhompageDao naverhompage = new NaverhompageDao(); 
	
//	public List<NaverhompageDto> selectList(){
//		List<NaverhompageDto> naverhompageDtos = new ArrayList<>();
//		
//		naverhompageDtos = naverhompageDao.selectList();
//		
//		return naverhompageDtos;
//	}	
	
	public List<NaverphoneDto> selectList(){
		return naverphoneDao.selectList();
	}

	public Object selectOne(NaverphoneDto naverphoneDto) {
		return naverphoneDao.selectOne(naverphoneDto);
	}
	
	public int insert(NaverphoneDto naverphoneDto) {
		return naverphoneDao.insert(naverphoneDto);
	}
}

