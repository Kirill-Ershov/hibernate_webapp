package com.kirill.project.hibernate_app_project.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Size(min = 2, max = 45, message = "Location name must be 2 to 45 symbols.")
    @NotBlank(message = "Location name is required. Spaces are now allowed.")
    @Column(name = "name")
    private String name;

    @Size(min = 2, max = 5, message = "Location code is required. Spaces are now allowed.")
    @Column(name = "code")
    private String code;

    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.PERSIST})
    @JoinColumn(name = "location")
    private List<DevEmployee> devEmployees;

    public Location() {
    }

    public Location(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void addEmployeeToLocation(DevEmployee devEmployee) {
        if (devEmployees == null) {
            devEmployees = new ArrayList<>();
        }
        devEmployees.add(devEmployee);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
//
    public List<DevEmployee> getDevEmployees() {
        return devEmployees;
    }

    public void setDevEmployees(List<DevEmployee> devEmployees) {
        this.devEmployees = devEmployees;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}' + "\n";
    }
}
