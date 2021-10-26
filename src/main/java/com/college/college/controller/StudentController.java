package com.college.college.controller;

import com.college.college.modal.Student;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/student")
public class StudentController {

    ConcurrentMap <String, Student> students = new ConcurrentHashMap<>();
    @GetMapping("/{sid}")
    @ApiOperation(value = "Returns details of specific Student as per Id entered.")
    public Student getStudent(@PathVariable String sid){
        return students.get(sid);
    }

    @GetMapping("/")
    @ApiOperation(value = "Returns list of all Students.")
    public List<Student> getAllStudents(){
        //System.out.println("Hello");
        return new ArrayList<Student>(students.values());
    }

    @PostMapping("/add")
    @ApiOperation(value = "Add new Student and returns its details.")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        students.put(student.getSid(), student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }


}
