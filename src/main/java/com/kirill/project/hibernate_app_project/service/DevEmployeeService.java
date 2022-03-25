package com.kirill.project.hibernate_app_project.service;

import com.kirill.project.hibernate_app_project.entity.DevEmployee;

import java.util.List;

public interface DevEmployeeService {

    List<DevEmployee> getAllEmployees();
    void saveEmployee(DevEmployee devEmployee);
    DevEmployee getEmployee(int id);
    void deleteEmployee(int id);

}
