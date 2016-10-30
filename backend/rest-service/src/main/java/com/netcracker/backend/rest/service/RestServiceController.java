package com.netcracker.backend.rest.service;

import com.netcracker.backend.exceptions.ServException;
import com.netcracker.backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by ilkh0715 on 27.10.2016.
 */

@RestController
public class RestServiceController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public Collection getEmployeeNames() throws ServException {
        return studentService.getAllStudent();
    }
}
