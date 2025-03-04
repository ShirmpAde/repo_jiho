package com.jeongjiho.fapp.addcontact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddcontactController {
	@Autowired
	AddcontactService addcontactService;
	
	@RequestMapping(value = "/addcontact/addcontactXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", addcontactService.selectList());
		return "addcontact/addcontactXdmList";
	}
}
