package com.epam.models.responses.getuserbyid;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GetEmloyeeByIdResponse{

	@JsonProperty("data")
	private Data data;

	@JsonProperty("message")
	private String message;

	@JsonProperty("status")
	private String status;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"GetEmloyeeByIdResponse{" + 
			"data = '" + data + '\'' + 
			",message = '" + message + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}