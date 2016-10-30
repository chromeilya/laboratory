package com.netcracker.backend.service;


import com.netcracker.backend.exceptions.ServException;
import com.netcracker.entities.Student;

import java.util.List;


public interface StudentService {

    public List<Student> getAllStudent() throws ServException;

    public Boolean deleteStudentById(Integer id) throws ServException;

    public Boolean saveStudent(Student student) throws ServException;

    public Student getStudentById(Integer id) throws ServException;

    public Boolean updateStudent(Student student) throws ServException;

    public List<Student> findStudents(String param) throws ServException;

}
