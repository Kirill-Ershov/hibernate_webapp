package com.kirill.project.hibernate_app_project.controller;

import com.kirill.project.hibernate_app_project.entity.DevEmployee;
import com.kirill.project.hibernate_app_project.entity.Location;
import com.kirill.project.hibernate_app_project.service.DevEmployeeService;
import com.kirill.project.hibernate_app_project.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private DevEmployeeService devEmployeeService;

    @Autowired
    private LocationService locationService;

    @RequestMapping("/")
    public String startpage() {
        return "startpage";
    }

    @RequestMapping("/startpage")
    public String startpageVoid() {
        return "startpage";
    }

    @RequestMapping("/employees")
    public String showAllEmployees(Model model) {
        List<DevEmployee> allEmployees = devEmployeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {
        DevEmployee devEmployee = new DevEmployee();
        model.addAttribute("employee", devEmployee);
        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@Valid @ModelAttribute("employee") DevEmployee devEmployee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "employee-info";
        }
        devEmployeeService.saveEmployee(devEmployee);
        return "redirect:/employees";
    }

    @RequestMapping("/updateEmpInfo")
    public String updateEmployee(@RequestParam("empId") int id, Model model) {
        DevEmployee devEmployee = devEmployeeService.getEmployee(id);
        model.addAttribute("employee", devEmployee);
        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id) {
        devEmployeeService.deleteEmployee(id);
        return "redirect:/employees";
    }

    @RequestMapping("/locations")
    public String showAllLocations(Model model) {
        List<Location> allLocations = locationService.getAllLocations();
        model.addAttribute("allLocs", allLocations);
        return "all-locations";
    }

    @RequestMapping("/addNewLocation")
    public String addNewLocation(Model model) {
        Location location = new Location();
        model.addAttribute("location", location);
        return "location-info";
    }

    @RequestMapping("/saveLocation")
    public String saveLocation(@Valid @ModelAttribute("location") Location location, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "location-info";
        }
        locationService.saveLocation(location);
        return "redirect:/locations";
    }

    @RequestMapping("/updateLocInfo")
    public String updateLocation(@RequestParam("locId") int id, Model model) {
        Location location = locationService.getLocation(id);
        model.addAttribute("location", location);
        return "location-info";
    }

    @RequestMapping("/deleteLocation")
    public String deleteLocation(@RequestParam("locId") int id) {
        locationService.deleteLocation(id);
        return "redirect:/locations";
    }
}
