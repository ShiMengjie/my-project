package com.example.query.annotation.service;

import com.example.query.annotation.dao.EmployeeMapper;
import com.example.query.annotation.dto.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @date 2023/12/17:12:22
 */
@Service
@RequiredArgsConstructor
public class EmployeeQueryService {

    private final EmployeeMapper employeeMapper;



    public EmployeeDTO getEmployee(Long id) {

    }
}
