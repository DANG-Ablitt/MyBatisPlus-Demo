package com.mybatisplus;

import com.mybatisplus.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusLogicDeleteTests {

    /**
     * 逻辑删除测试
     */
    @Test
    public void testLogicDelete(){
        //这里使用了AR
        new Employee().deleteById(1);
    }
}
