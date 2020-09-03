package com.epam.services;

import com.epam.models.requests.createemloyee.CreateEmployeeRequest;
import com.epam.models.responses.createemloyee.CreateEmployeeResponse;
import com.epam.models.responses.getuserbyid.GetEmloyeeByIdResponse;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class EmployeeService {

    public GetEmloyeeByIdResponse getEmployeeById(int epmId){
        return RestAssured
                .given().header("Content-Type", ContentType.JSON).log().all()
                .when().get("http://dummy.restapiexample.com/api/v1/employee/" + epmId)
                .then().log().all().statusCode(200).extract().as(GetEmloyeeByIdResponse.class);
    }

    public CreateEmployeeResponse createEmployee(CreateEmployeeRequest createEmployeeRequest){
        return RestAssured
                .given().header("Content-Type", ContentType.JSON).body(createEmployeeRequest)
                .when().post("http://dummy.restapiexample.com/api/v1/create")
                .then().statusCode(200).extract().as(CreateEmployeeResponse.class);
    }

}
