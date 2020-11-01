package com.mybatisplus.metaobjecthandler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

@Component
public class TestMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("插入操作  满足填充条件");
        //获取需要被填充的字段值
        Object fieldValue=getFieldValByName("age",metaObject);
        //判断
        if(fieldValue!=null) {return;}
        //满足条件就填充
        setFieldValByName("age",99,metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        System.out.println("修改操作  满足填充条件");
        //获取需要被填充的字段值
        Object fieldValue=getFieldValByName("gender",metaObject);
        //判断
        if(fieldValue!=null) {return;}
        //满足条件就填充
        setFieldValByName("gender",1,metaObject);
    }
}
