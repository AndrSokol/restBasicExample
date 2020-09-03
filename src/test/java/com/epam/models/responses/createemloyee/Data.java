package com.epam.models.responses.createemloyee;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Data{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

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

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
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
			"Data{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",salary = '" + salary + '\'' + 
			",age = '" + age + '\'' + 
			"}";
		}
}