package com.epam.tests;

import com.epam.models.requests.createemloyee.CreateEmployeeRequest;
import com.epam.models.responses.createemloyee.CreateEmployeeResponse;
import com.epam.models.responses.getuserbyid.GetEmloyeeByIdResponse;
import com.epam.services.EmployeeService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {

    // dummy: http://dummy.restapiexample.com/

    EmployeeService employeeService = new EmployeeService();

    @Test
    public void testCanGetUserById(){
        // GIVEN
        int employeeId = 1;

        // WHEN
        GetEmloyeeByIdResponse actualEmployee = employeeService.getEmployeeById(1);

        // THEN
        assertThat(actualEmployee.getData().getId()).isEqualTo(employeeId);
        assertThat(actualEmployee.getMessage()).contains("Successfully!");
    }

    @Test
    public void testCanCreateEmployee(){
        // GIVEN
        CreateEmployeeRequest createEmployeeRequest = new CreateEmployeeRequest();
        createEmployeeRequest.setAge("30");
        createEmployeeRequest.setName("Test");
        createEmployeeRequest.setSalary("5K");

        // WHEN
        CreateEmployeeResponse response = employeeService.createEmployee(createEmployeeRequest);

        // THEN
        assertThat(response.getMessage()).contains("Record has been added");
        assertThat(response.getData().getAge()).isEqualTo("30");
    }


}
