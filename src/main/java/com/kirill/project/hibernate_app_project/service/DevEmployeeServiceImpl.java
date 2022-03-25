package com.kirill.project.hibernate_app_project.service;

import com.kirill.project.hibernate_app_project.dao.DevEmployeeDAO;
import com.kirill.project.hibernate_app_project.entity.DevEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DevEmployeeServiceImpl implements DevEmployeeService {

    @Autowired
    private DevEmployeeDAO devEmployeeDAO;

    @Override
    @Transactional
    public List<DevEmployee> getAllEmployees() {
        return devEmployeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(DevEmployee devEmployee) {
        devEmployeeDAO.saveEmployee(devEmployee);
    }

    @Override
    @Transactional
    public DevEmployee getEmployee(int id) {
        return devEmployeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        devEmployeeDAO.deleteEmployee(id);
    }
}
