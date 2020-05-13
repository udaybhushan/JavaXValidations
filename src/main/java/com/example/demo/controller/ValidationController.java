package com.example.demo.controller;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.ElectronicCatogory;
import com.example.demo.request.PersonDetails;
import com.example.demo.service.ValidationService;

@RestController
@RequestMapping("/validation")
public class ValidationController {
	@Autowired
	ValidationService service;

	@PostMapping("/stringValidation")
	public String stringValidations(@Valid @RequestBody ElectronicCatogory electronicCatogory) {
		return service.validatedStringRelatedPojo(electronicCatogory);
	}
	
	@PostMapping("/dateValidation")
	public String dateValidation(@Valid @RequestBody PersonDetails personDetails) {
		return service.ValidatedDate(personDetails);
	}
}
