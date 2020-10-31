package com.mybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.mybatisplus.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusAutoGeneratorTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     *代码生成器演示
     */
    @Test
    public void testAutoGenerator(){
        /**
         * 全局配置
         */
        GlobalConfig globalConfig = new GlobalConfig();
        //生成路径
        globalConfig.setOutputDir("");
        //作者
        globalConfig.setAuthor("jobob");
        //多次生成是否文件覆盖
        globalConfig.setFileOverride(true);
        //主键策略
        globalConfig.setIdType(IdType.AUTO);
        //设置生成的Service接口的名字的首字母是否为I（如EmployeeService 默认生成IEmployeeService）
        globalConfig.setServiceName("%sService");
        globalConfig.setBaseResultMap(true);
        globalConfig.setBaseColumnList(true);
        /**
         * 数据源配置
         */
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        //设置数据库类型
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/ant?useUnicode=true&useSSL=false&characterEncoding=utf8");
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        /**
         * 策略配置
         */
        StrategyConfig strategy = new StrategyConfig();
        //数据库表映射到实体的命名策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //全局大写命名
        strategy.setCapitalMode(true);
        //
        strategy.setTablePrefix("tb1_");
        //生成的表
        strategy.setInclude("tb1_employee");
        /**
         * 包名配置
         */
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("");
        pc.setParent("com.baomidou.ant");
        /**
         * 整合配置
         */
        AutoGenerator autoGenerator=new AutoGenerator();
        autoGenerator.setGlobalConfig(globalConfig);
        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator.setPackageInfo(pc);
        autoGenerator.setStrategy(strategy);
        //执行
        autoGenerator.execute();
    }
}
