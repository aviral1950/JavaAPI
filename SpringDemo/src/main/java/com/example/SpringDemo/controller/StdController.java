package com.example.SpringDemo.controller;

import com.example.SpringDemo.entity.DataTransObj;
import com.example.SpringDemo.entity.Student;
import com.example.SpringDemo.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StdController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public ResponseEntity<DataTransObj> createStudent(@RequestBody DataTransObj stdDto){
        DataTransObj createStdDto=this.userService.createStd(stdDto);
        return new ResponseEntity<>(createStdDto, HttpStatus.CREATED);
    }
    @GetMapping("/")
    public  ResponseEntity<List<DataTransObj>> getAllStd(){
        return ResponseEntity.ok(this.userService.loadStd());
    }
}
