package com.atguigu.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : xsh
 * @create : 2021-05-15 - 22:08
 * @describe:
 */
@SpringBootApplication
@MapperScan("com.atguigu.product.dao")
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
