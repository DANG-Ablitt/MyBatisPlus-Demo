package com.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatisplus.entity.Employee;
import com.mybatisplus.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
public class MyBatisPlusDemoEWTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 条件构造器 查询操作
     */
    @Test
    public void testAbstractWrapperSelect(){
        /**
         * 查询条件：
         * 从tbi_employee表中查询年龄在20至50岁之间的男性
         * SQL:SELECT id,last_name,email,gender,age FROM tbi_employee WHERE (age BETWEEN ? AND ? AND gender = ?)
         */
        //List<Employee> list=employeeMapper.selectList(new QueryWrapper<Employee>()
        //       .between("age",20,50)
        //       .eq("gender",1));
        //System.out.println(list);
        /**
         * 查询条件：
         * 从tbi_employee表中查询性别为女，且名字中带有老师或者邮箱中带有a
         */
        List<Employee> list=employeeMapper.selectList(new QueryWrapper<Employee>()
                .eq("gender",0)
                .like("last_name","老师")
                .or()
                .like("email","a"));
        System.out.println(list);
    }
}
