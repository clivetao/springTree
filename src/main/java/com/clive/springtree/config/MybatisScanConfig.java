package com.clive.springtree.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.clive.springtree.dao")
public class MybatisScanConfig {
}
