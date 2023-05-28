package com.example.SpringDemo.service;

import com.example.SpringDemo.entity.DataTransObj;

import java.util.List;

public interface UserService {
    DataTransObj createStd(DataTransObj student);
    List<DataTransObj> loadStd();

}
