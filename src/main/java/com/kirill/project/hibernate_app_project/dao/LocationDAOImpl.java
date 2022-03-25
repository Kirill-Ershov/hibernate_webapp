package com.kirill.project.hibernate_app_project.dao;

import com.kirill.project.hibernate_app_project.entity.Location;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LocationDAOImpl implements LocationDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Location> getAllLocations() {
        Session session = sessionFactory.getCurrentSession();
        Query<Location>query = session.createQuery("from Location", Location.class);
        List<Location> allLocations = query.getResultList();
        return allLocations;
    }

    @Override
    public void saveLocation(Location location) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(location);
    }

    @Override
    public Location getLocation(int id) {
        Session session = sessionFactory.getCurrentSession();
        Location location = session.get(Location.class, id);
        return location;
    }

    @Override
    public void deleteLocation(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Location> query = session.createQuery("delete from Location where id =:locationId");
        query.setParameter("locationId", id);
        query.executeUpdate();
    }
}
