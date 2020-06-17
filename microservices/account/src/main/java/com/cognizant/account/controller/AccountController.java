package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@GetMapping("/{number}")
	public String getAccDetails(@PathVariable String number) {
		return "number: " + number + ", type: \"savings\", balance: 234343";
	}
}
