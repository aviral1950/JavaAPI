package com.example.SpringDemo.service;

import com.example.SpringDemo.entity.DataTransObj;
import com.example.SpringDemo.entity.Student;
import com.example.SpringDemo.repo.StdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class StdService implements UserService {
    @Autowired
    private StdRepo stdRepo;

    @Override
    public DataTransObj createStd(DataTransObj stdDto) {
        Student student=this.dtoToStudent(stdDto);
        Student saveStd=this.stdRepo.save(student);
        return this.stdToDto(saveStd);

    }

    @Override
    public List<DataTransObj> loadStd() {
        List<Student> students=this.stdRepo.findAll();
        List<DataTransObj> stdDto =students.stream().map(student -> this.stdToDto(student)).collect(Collectors.toList());
        return stdDto;
    }
    private Student dtoToStudent(DataTransObj stdDto){
        Student student=new Student();
        student.setId(stdDto.getId());
        student.setName(stdDto.getName());
        student.setTmarks(stdDto.getTmarks());
        return student;
    }
    private DataTransObj stdToDto(Student student){
        DataTransObj dto=new DataTransObj();
        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setTmarks(student.getTmarks());
        return dto;
    }
}
