package com.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@Component
@TableName(value="tbi_employee")
/**
 * 继承Model<>：使用AR模式
 */
public class Employee extends Model<Employee> {
    /**
     * 用户id 主键 自增
     * 注意：这里为什么不用int而要使用Integer呢
     * 因为基本类型都有一个默认值，不便于非空判断
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    private String lastName;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 性别：0 女 1 男
     */
    private Integer gender;
    /**
     * 年龄
     */
    private Integer age;

    /**
     * AR主键配置
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
