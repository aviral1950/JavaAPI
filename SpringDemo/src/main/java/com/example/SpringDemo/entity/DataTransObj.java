package com.example.SpringDemo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataTransObj {
    private int id;
    private String name;
    private int tmarks;
}
