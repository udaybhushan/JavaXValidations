package com.example.demo.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ElectronicCatogory {
	
	@NotNull(message = "name Should not be null as I am using NOTNULL, it accepts empty values")
	@Min(value = 5)
	private String name;
	@NotEmpty(message = "type Should not be empty as I am using NOTEMPTY, it doesnt accept empty or null values")
	@Size(min = 2,max = 10,message = "Should not exceed length, if you dont specify message it will take the default message")
	private String type;
	@NotBlank(message = "itemMadeOf Should not be Blank as I am using NOTBlANK, it accept null values")
	@Max(value = 13)
	private String itemMadeOf;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getItemMadeOf() {
		return itemMadeOf;
	}
	public void setItemMadeOf(String itemMadeOf) {
		this.itemMadeOf = itemMadeOf;
	}
}
