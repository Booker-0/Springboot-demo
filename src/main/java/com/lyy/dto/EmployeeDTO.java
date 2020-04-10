package com.lyy.dto;

import lombok.Data;

import java.sql.Date;

/**
 * @version : V1.0
 * @ClassName: EmployeeDTO
 * @Description: TODO
 * @Auther: lyy
 * @Date: 2020/2/25 23:10
 */
@Data
public class EmployeeDTO {
    private int id;
    private String employeeName;
    private String email;
    private int gender;
    private String departmentName;
    private Date date;
}
