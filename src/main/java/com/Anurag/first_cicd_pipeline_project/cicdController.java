package com.Anurag.first_cicd_pipeline_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cicdController {
	@RequestMapping("/test")
	public String test() {
		return "This is test to ci/cd";
	}
	@RequestMapping("/success")
	public String test1() {
		return "The test completed.";
	}
}
