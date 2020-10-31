package com.mybatisplus;

import com.mybatisplus.entity.Employee;
import com.mybatisplus.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class MyBatisPlusApplicationTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 通用查询方法
     */
    @Test
    public void testCommonSelect() {
        /**
         *
         */
        //Employee employee=employeeMapper.selectById(1);
        //System.out.print(employee);
        /**
         *
         */
        //Employee employee=new Employee();
        //employee.setId(1);
        //employee.setLastName("Www");
        //employee.setEmail("www@google.com");
        //employeeMapper.selectOne(null);
        /**
         * 多个id
         */
        //List<Integer> employees=new ArrayList<>();
        //employees.add(1);
        //employees.add(2);
        //employees.add(3);
        //List<Employee> ii=employeeMapper.selectBatchIds(employees);
        //System.out.print(ii);
        /**
         * Map封装条件查询
         */
        //Map<String,Object> columnmap=new HashMap<>();
        //columnmap.put("last_name","Www");
        //columnmap.put("gender",1);
        //List<Employee> ifh=employeeMapper.selectByMap(columnmap);
        //System.out.print(ifh);
        /**
         * 分页查询
         */
        //List<Employee> ifh=employeeMapper.selectPage(new Page<Object>(2,2),null);

    }

    /**
     * 通用添加方法
     */
    @Test
    public void testCommonInsert() {
        /**
         *
         */
        //Employee employee=new Employee();
        //employee.setLastName("Www");
        //employee.setEmail("www@google.com");
        //employee.setGender(1);
        //employee.setAge(56);
        //Integer id=employeeMapper.insert(employee);
        //System.out.print(id);
        /**
         *
         */
        Employee employee=new Employee();
        employee.setLastName("Www");
        employee.setEmail("www@google.com");
        Integer id=employeeMapper.insert(employee);
        System.out.print(id);

    }

    /**
     * 通用修改方法
     */
    @Test
    public void testCommonUpdate() {
        /**
         *
         */
        //Employee employee=new Employee();
        //employee.setId(3);
        //employee.setLastName("Www");
        //employee.setEmail("www@google.com");
        //employee.setGender(1);
        //employee.setAge(56);
        //Integer id=employeeMapper.updateById(employee);
        //System.out.print(id);
        /**
         *
         */
        //Employee employee=new Employee();
        //employee.setId(3);
        //employee.setLastName("Www");
        //employee.setEmail("www@google.com");
        //Integer id=employeeMapper.updateAllC
        //System.out.print(id);

    }

    /**
     * 通用删除方法
     */
    @Test
    public void testCommonDelete() {
        /**
         * 根据ID删除
         */
        //Integer id=employeeMapper.deleteById(7);
        //System.out.print(id);
        /**
         * Map封装条件删除
         */
        //Map<String,Object> columnmap=new HashMap<>();
        //columnmap.put("last_name","Www");
        //columnmap.put("gender",1);
        //Integer id=employeeMapper.deleteByMap(columnmap);
        //System.out.print(id);
        /**
         * 批量删除
         */
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(5);
        Integer id=employeeMapper.deleteBatchIds(list);
        System.out.print(id);
    }
}
