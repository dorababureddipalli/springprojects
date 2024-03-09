package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.batches.BatchSteps;

@Controller
public class DC_CasesController {
	@Autowired
	private BatchSteps bs;

	@GetMapping(value = "/start")
	public @ResponseBody String dataInsertion() {
		bs.main();
		return "Batch Executed";
	}

}
