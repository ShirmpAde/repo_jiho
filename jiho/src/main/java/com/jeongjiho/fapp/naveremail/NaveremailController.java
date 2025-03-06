package com.jeongjiho.fapp.naveremail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NaveremailController {
	
	@Autowired
	NaveremailService naveremailService;
			
	@RequestMapping(value = "/naveremail/naveremailXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", naveremailService.selectList());
		return "naveremail/naveremailXdmList";
	}
	
	@RequestMapping(value = "/naveremail/naveremailXdmView")
	public String naveremailXdmList(Model model, NaveremailDto naveremailDto) {
		System.out.println("naveremailDto.getSeq(): " + naveremailDto.getSeq());
		model.addAttribute("item", naveremailService.selectOne(naveremailDto));
		return "naveremail/naveremailXdmView";
	}
	
	@RequestMapping(value = "/naveremail/naveremailXdmForm")
	public String naveremailXdmForm() {
		
		return "naveremail/naveremailXdmForm";
	}
	
	@RequestMapping(value = "/naveremail/naveremailXdmInst")
	public String naveremailXdmInst(NaveremailDto naveremailDto) {
		System.out.println("naveremailDto.getSeq(): " + naveremailDto.getSeq());
		System.out.println("naveremailDto.getemailAccount(): " + naveremailDto.getEmailAccount());
		
		naveremailService.insert(naveremailDto);
		
		System.out.println("naveremailDto.getSeq(): " + naveremailDto.getSeq());
		
		return "redirect:/naveremail//naveremailXdmList";
	}
}


