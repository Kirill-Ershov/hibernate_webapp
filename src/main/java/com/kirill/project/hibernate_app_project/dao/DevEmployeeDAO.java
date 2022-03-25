package com.kirill.project.hibernate_app_project.dao;

import com.kirill.project.hibernate_app_project.entity.DevEmployee;

import java.util.List;

public interface DevEmployeeDAO {

    List<DevEmployee> getAllEmployees();
    void saveEmployee(DevEmployee devEmployee);
    DevEmployee getEmployee(int id);
    void deleteEmployee(int id);

}
