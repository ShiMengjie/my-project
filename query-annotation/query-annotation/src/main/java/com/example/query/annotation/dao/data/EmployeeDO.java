package com.example.query.annotation.dao.data;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @date 2023/12/17:12:18
 */
@Data
public class EmployeeDO {
    private Long id;

    private String name;

    private String departmentId;

    private LocalDateTime createdAt;
}
