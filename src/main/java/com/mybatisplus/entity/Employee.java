package com.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
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
    @TableField(fill = FieldFill.UPDATE)
    private Integer gender;
    /**
     * 年龄
     * @TableField 注解的作用是字段填充
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer age;
    /**
     * 逻辑删除标识字段
     * 使用@TableLogic注解标识逻辑字段
     */
    @TableLogic
    private Integer d_id;

    /**
     * AR主键配置
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
