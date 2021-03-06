package com.lyy.service;

import com.lyy.mapper.DepartmentMapper;
import com.lyy.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version : V1.0
 * @ClassName: DepartmentServiceImpl
 * @Description: TODO
 * @Auther: lyy
 * @Date: 2020/2/25 21:37
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectAllDepartment() {
        return departmentMapper.selectAllDepartment();
    }

}
