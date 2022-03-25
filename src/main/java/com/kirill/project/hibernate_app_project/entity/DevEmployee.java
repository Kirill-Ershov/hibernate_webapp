package com.kirill.project.hibernate_app_project.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "dev_employees")
public class DevEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Size(min = 2, max = 20, message = "Name must be 2 to 20 symbols.")
    @NotBlank(message = "Name is required. Spaces are not allowed.")
    @Column(name = "name")
    private String name;

    @Size(min = 2, max = 20, message = "Surname must be 2 to 20 symbols.")
    @NotBlank(message = "Surname is required. Spaces are not allowed.")
    @Column(name = "surname")
    private String surname;

    @Column(name = "grade")
    private String grade;

    @Column(name = "pl")
    private String pl;

    @Min(value = 1, message = "Must be more than 0.")
    @Column(name = "salary")
    private int salary;

    @Column(name = "location")
    private Integer location;

    @Column(name = "phone")
    @Pattern(regexp = "\\+\\d \\(\\d{3}\\) \\d{3}-\\d{2}-\\d{2}", message = "Please, use pattern +X (XXX) XXX-XX-XX")
    private String phoneNumber;

    public DevEmployee() {
    }

    public DevEmployee(String name, String surname, String grade, String pl, int salary, int location) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.pl = pl;
        this.salary = salary;
        this.location = location;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "DevEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade='" + grade + '\'' +
                ", pl='" + pl + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
