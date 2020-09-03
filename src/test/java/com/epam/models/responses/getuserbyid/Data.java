package com.epam.models.responses.getuserbyid;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Data{

	@JsonProperty("profile_image")
	private String profileImage;

	@JsonProperty("employee_name")
	private String employeeName;

	@JsonProperty("employee_salary")
	private int employeeSalary;

	@JsonProperty("id")
	private int id;

	@JsonProperty("employee_age")
	private int employeeAge;

	public void setProfileImage(String profileImage){
		this.profileImage = profileImage;
	}

	public String getProfileImage(){
		return profileImage;
	}

	public void setEmployeeName(String employeeName){
		this.employeeName = employeeName;
	}

	public String getEmployeeName(){
		return employeeName;
	}

	public void setEmployeeSalary(int employeeSalary){
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeSalary(){
		return employeeSalary;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setEmployeeAge(int employeeAge){
		this.employeeAge = employeeAge;
	}

	public int getEmployeeAge(){
		return employeeAge;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"profile_image = '" + profileImage + '\'' + 
			",employee_name = '" + employeeName + '\'' + 
			",employee_salary = '" + employeeSalary + '\'' + 
			",id = '" + id + '\'' + 
			",employee_age = '" + employeeAge + '\'' + 
			"}";
		}
}