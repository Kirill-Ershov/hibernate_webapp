package com.kirill.project.hibernate_app_project.dao;

import com.kirill.project.hibernate_app_project.entity.DevEmployee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DevEmployeeDAOImpl implements DevEmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<DevEmployee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        Query<DevEmployee> employeeQuery = session.createQuery("from DevEmployee", DevEmployee.class);
        List<DevEmployee> allEmployees = employeeQuery.getResultList();
        return allEmployees;
    }

    @Override
    public void saveEmployee(DevEmployee devEmployee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(devEmployee);
    }

    @Override
    public DevEmployee getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        DevEmployee devEmployee = session.get(DevEmployee.class, id);
        return devEmployee;
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<DevEmployee> query = session.createQuery("delete from DevEmployee where id =:devEmployeeId");
        query.setParameter("devEmployeeId", id);
        query.executeUpdate();
    }
}
