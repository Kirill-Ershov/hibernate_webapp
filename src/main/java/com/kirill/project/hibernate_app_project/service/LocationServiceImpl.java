package com.kirill.project.hibernate_app_project.service;

import com.kirill.project.hibernate_app_project.dao.LocationDAO;
import com.kirill.project.hibernate_app_project.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationDAO locationDAO;

    @Override
    @Transactional
    public List<Location> getAllLocations() {
        return locationDAO.getAllLocations();
    }

    @Override
    @Transactional
    public void saveLocation(Location location) {
        locationDAO.saveLocation(location);
    }

    @Override
    @Transactional
    public Location getLocation(int id) {
        return locationDAO.getLocation(id);
    }

    @Override
    @Transactional
    public void deleteLocation(int id) {
        locationDAO.deleteLocation(id);
    }
}
