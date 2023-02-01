package com.careerdevs.department.controller;

import com.careerdevs.department.entity.Department;
import com.careerdevs.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment( @RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController");
        return  departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable ("id") Long departmentId){
        log.info("Inside saveDepartment method of DepartmentController");
        return  departmentService.findDepartmentById(departmentId);
    }
}
