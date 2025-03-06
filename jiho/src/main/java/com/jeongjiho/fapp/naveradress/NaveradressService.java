package com.jeongjiho.fapp.naveradress;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaveradressService {

	@Autowired
	NaveradressDao naveradressDao;
//	NaverhompageDao naverhompage = new NaverhompageDao(); 
	
//	public List<NaverhompageDto> selectList(){
//		List<NaverhompageDto> naverhompageDtos = new ArrayList<>();
//		
//		naverhompageDtos = naverhompageDao.selectList();
//		
//		return naverhompageDtos;
//	}	
	
	public List<NaveradressDto> selectList(){
		return naveradressDao.selectList();
	}

	public Object selectOne(NaveradressDto naveradressDto) {
		return naveradressDao.selectOne(naveradressDto);
	}
	
	public int insert(NaveradressDto naveradressDto) {
		return naveradressDao.insert(naveradressDto);
	}
}

