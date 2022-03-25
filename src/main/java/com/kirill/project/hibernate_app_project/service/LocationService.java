package com.kirill.project.hibernate_app_project.service;

import com.kirill.project.hibernate_app_project.entity.Location;

import java.util.List;

public interface LocationService {
    List<Location> getAllLocations();
    void saveLocation(Location location);
    Location getLocation(int id);
    void deleteLocation(int id);
}
