package com.mybatisplus;

import com.mybatisplus.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusMetaObjectHandlerTests {
    /**
     * 自动填充测试
     */
    @Test
    public void testInsert(){
        /**
         * 插入的自动填充
         * 这里没有给age字段数据
         */
        Employee employee=new Employee();
        employee.setLastName("狗狗老师");
        employee.setEmail("gg@sina.com");
        employee.setGender(1);
        //注意：这里使用了AR
        employee.insert();
    }

    @Test
    public void testUpdate(){
        /**
         * 修改的自动填充
         * 这里没有给gender字段数据
         */
        Employee employee=new Employee();
        employee.setId(10);
        employee.setLastName("小狗老师");
        employee.setEmail("xg@sina.com");
        employee.setAge(25);
        //注意：这里使用了AR
        employee.updateById();
    }
}
