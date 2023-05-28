package com.example.SpringDemo.repo;

import com.example.SpringDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StdRepo extends JpaRepository<Student,Integer> {

}
