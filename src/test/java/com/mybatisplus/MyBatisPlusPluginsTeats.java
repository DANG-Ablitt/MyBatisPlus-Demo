package com.mybatisplus;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatisplus.entity.Employee;
import com.mybatisplus.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyBatisPlusPluginsTeats {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 分页插件测试
     */
    @Test
    public void testPaginationInnerInterceptor(){
        IPage<Employee> page=new Page<Employee>(1,1);
        IPage<Employee> employees=employeeMapper.selectPage(page,null);
        System.out.println(employees.getRecords());
        System.out.println("**********************获取分页相关的一些信息**********************");
        System.out.println("总条数："+page.getTotal());
        System.out.println("当前页码："+page.getCurrent());
        System.out.println("总页码："+page.getCurrent());
        System.out.println("每页显示的条数："+page.getSize());
    }
    /**
     *防止全表更新与删除插件测试
     * 报错信息：Cause: com.baomidou.mybatisplus.core.exceptions.MybatisPlusException: Prohibition of full table deletion
     */
    @Test
    public void testBlockAttackInnerInterceptor(){
        //尝试删除全表数据
        employeeMapper.delete(null);
    }
    /**
     * 性能分析规范插件
     */
}
