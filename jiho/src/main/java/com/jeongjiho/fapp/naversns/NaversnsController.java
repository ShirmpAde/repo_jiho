package com.jeongjiho.fapp.naversns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NaversnsController {

	@Autowired
	NaversnsService naversnsService;
	
	@RequestMapping(value = "/naversns/naversnsXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", naversnsService.selectList());
		return "naversns/naversnsXdmList";
	}
}
