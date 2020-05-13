package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.demo.request.ElectronicCatogory;
import com.example.demo.request.PersonDetails;

@Service
public class ValidationService {

	public String validatedStringRelatedPojo(ElectronicCatogory electronicCatogory) {
		return "Validated Successfull";
	}

	public String ValidatedDate(@Valid PersonDetails personDetails) {
		return "validation successfull";
	}

}
