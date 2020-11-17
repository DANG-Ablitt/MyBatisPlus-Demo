package com.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatisplus.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyBatisPlusARTests {

    /**
     * 通过AR方式查询
     */
    @Test
    public void tastSelect(){
        /**
         * 根据id查询
         * SQL：SELECT id,last_name,email,gender,age FROM tbi_employee WHERE id=?
         */
        //Employee employee=new Employee().selectById(1);
        //System.out.println(employee);
        /**
         * 根据主键查询
         * SQL与上边的相同
         * 原因：return selectById(pkVal());
         */
        //Employee employee=new Employee();
        //employee.setId(1);
        //Employee result=employee.selectById();
        //System.out.println(result);
        /**
         * 查询所有
         * SQL:SELECT id,last_name,email,gender,age FROM tbi_employee
         */
        //List<Employee> employee=new Employee().selectAll();
        //System.out.println(employee);
        /**
         * 查询总记录数
         * 查询tbi_employee表中姓名带有老师的
         * SQL:SELECT id,last_name,email,gender,age FROM tbi_employee WHERE (last_name LIKE ?)
         */
        //List<Employee> employee=new Employee().selectList(new QueryWrapper<Employee>().like("last_name","老师"));
        //System.out.println(employee);
        /**
         * 查询一条记录
         * 查询tbi_employee表中id为3的数据
         * SQL：SELECT id,last_name,email,gender,age FROM tbi_employee WHERE (id = ?)
         */
        //Employee employee=new Employee().selectOne(new QueryWrapper<Employee>().eq("id",3));
        //System.out.println(employee);
        /**
         * 翻页查询
         * 待解决的问题：SQL无法拼接分页
         */
        //Page<Employee> employeePage=new Employee().selectPage(
        //        new Page<Employee>(1,1),
        //        new QueryWrapper<Employee>().like("last_name","老师"));
        //List<Employee> employees=employeePage.getRecords();
        //System.out.println(employees);
        /**
         *查询总数
         * 查询tbi_employee表中姓名包含老师的数据有几条
         * SQL：SELECT COUNT( 1 ) FROM tbi_employee WHERE (last_name LIKE ?)
         */
        Integer ruseln=new Employee().selectCount(new QueryWrapper<Employee>().like("last_name","老师"));
        System.out.println(ruseln);
    }

    /**
     * 通过AR方式添加
     */
    @Test
    public void testInsert(){
        /**
         *插入操作
         * SQL:INSERT INTO tbi_employee ( last_name, email, gender, age ) VALUES ( ?, ?, ?, ? )
         * 如果注释掉Gender和Age
         * INSERT INTO tbi_employee ( last_name, email ) VALUES ( ?, ? )
         */
        Employee employee=new Employee();
        employee.setLastName("小李老师");
        employee.setEmail("xl@sina.com");
        employee.setGender(1);
        employee.setAge(65);
        //添加：因为Employee类继承了Model类，所以可以直接调用Model类中的方法
        boolean i=employee.insert();
        System.out.println(i);
    }

    /**
     * 通过AR方式修改
     */
    @Test
    public void testUpdate(){
        /**
         *
         */

    }

    /**
     * 通过AR方式删除
     */
}
