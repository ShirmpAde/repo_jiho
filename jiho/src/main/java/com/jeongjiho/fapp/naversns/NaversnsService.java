package com.jeongjiho.fapp.naversns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaversnsService {

	@Autowired
	NaversnsDao naversnsDao;
	
	public List<NaversnsDto> selectList(){
		return naversnsDao.selectList();
	}
}
