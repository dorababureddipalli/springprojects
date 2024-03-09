package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.entity.StatesMaster;
import com.services.StatesMasterService;

@Controller
public class StatesController {
	
	@Autowired
	private StatesMasterService sms;
	
	@GetMapping(value="/load")
	public String loadform(Model m) {
		
		sms.save(new StatesMaster(1,"India","+91"));
		sms.save(new StatesMaster(2,"Newzland","+813"));
		List<StatesMaster> stateList = sms.viewStates();
		System.out.println(stateList);
		m.addAttribute("list", stateList);
		return "states";
	}
}
