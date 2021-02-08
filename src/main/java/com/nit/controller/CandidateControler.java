package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.nit.bean.Candidate;

@Controller
public class CandidateControler {
	@PostMapping("/processForm")
	public String showResult(@ModelAttribute("candidate") Candidate candidate) {
		String userId = "";
		String[] name = candidate.getName().split(" ");
		userId = name[0].concat(String.valueOf(candidate.hashCode())).concat("-").concat(candidate.getCountry());
		candidate.setUserId(userId);
		System.out.println("INFO : showResult(@ModelAttribute(\"candidate\") Candidate candidate) got executed");
		return "msg";

	}

}
