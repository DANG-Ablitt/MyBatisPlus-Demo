package com.mybatisplus.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.IllegalSQLInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        /**
         * 分页插件
         * 新的分页插件,一缓和二缓遵循mybatis的规则
         * 需要设置 MybatisConfiguration#useDeprecatedExecutor = false
         * 避免缓存出现问题(该属性会在旧插件移除后一同移除)
         * SQL:SELECT id,last_name,email,gender,age FROM tbi_employee LIMIT ?
         */
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        /**
         * 防止全表删除和更新插件
         */
        //interceptor.addInnerInterceptor(new BlockAttackInnerInterceptor());
        /**
         * 性能规范和分析插件
         */
        //interceptor.addInnerInterceptor(new IllegalSQLInnerInterceptor());

        return interceptor;
    }

    /**
     * 执行分析插件
     */

    /**
     * 性能分析插件
     */

    /**
     * 乐观锁插件
     */
}
