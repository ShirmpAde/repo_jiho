package com.jeongjiho.fapp.naversns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaversnsService {

	@Autowired
	NaversnsDao naversnsDao;
//	NaverhompageDao naverhompage = new NaverhompageDao(); 
	
//	public List<NaverhompageDto> selectList(){
//		List<NaverhompageDto> naverhompageDtos = new ArrayList<>();
//		
//		naverhompageDtos = naverhompageDao.selectList();
//		
//		return naverhompageDtos;
//	}	
	
	public List<NaversnsDto> selectList(){
		return naversnsDao.selectList();
	}

	public Object selectOne(NaversnsDto naversnsDto) {
		return naversnsDao.selectOne(naversnsDto);
	}
	
	public int insert(NaversnsDto naversnsDto) {
		return naversnsDao.insert(naversnsDto);
	}
}

