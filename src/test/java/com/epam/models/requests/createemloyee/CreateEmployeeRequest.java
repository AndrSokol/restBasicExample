package com.epam.models.requests.createemloyee;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CreateEmployeeRequest {

	@JsonProperty("name")
	private String name;

	@JsonProperty("salary")
	private String salary;

	@JsonProperty("age")
	private String age;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSalary(String salary){
		this.salary = salary;
	}

	public String getSalary(){
		return salary;
	}

	public void setAge(String age){
		this.age = age;
	}

	public String getAge(){
		return age;
	}

	@Override
 	public String toString(){
		return 
			"CreateEmloyeeRequest{" + 
			"name = '" + name + '\'' + 
			",salary = '" + salary + '\'' + 
			",age = '" + age + '\'' + 
			"}";
		}
}