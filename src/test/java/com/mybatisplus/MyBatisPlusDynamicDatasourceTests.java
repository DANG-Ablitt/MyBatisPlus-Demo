package com.mybatisplus;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.mybatisplus.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.activation.DataSource;

@SpringBootTest
public class MyBatisPlusDynamicDatasourceTests {

    /**
     * 多数据源测试
     * 官方文档：https://github.com/baomidou/dynamic-datasource-spring-boot-starter
     *          https://gitee.com/FrankEvil/dynamic-datasource-spring-boot-starter
     * 从MySql数据库中读取tbi_employee数据
     */
    @Test
    //@DS("mysql")
    public void testDynamicDatasourceMySql(){
        Employee employee1=new Employee().selectById(2);
        System.out.println(employee1);
    }
    /**
     * 从Sql Server数据库中读取tbi_employee数据
     */

    @Test
    //@DS("SqlServer")
    public void testDynamicDatasourceSqlServer(){
        Employee employee2=new Employee().selectById(3);
        System.out.println(employee2);
    }
}
