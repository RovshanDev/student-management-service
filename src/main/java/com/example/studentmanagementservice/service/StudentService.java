package com.example.studentmanagementservice.service;

import com.example.studentmanagementservice.dto.StudentResponse;

import java.util.List;

public interface StudentService {
    List<StudentResponse> findAll();
}