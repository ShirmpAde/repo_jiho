package com.jeongjiho.fapp.naveradress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NaveradressController {
	
	@Autowired
	NaveradressService naveradressService;
	
	@RequestMapping(value = "/naveradress/naveradressXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", naveradressService.selectList());
		return "naveradress/naveradressXdmList";
	}
}
