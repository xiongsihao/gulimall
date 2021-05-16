package com.atguigu.gulimall.product;

import com.atguigu.product.GulimallProductApplication;
import com.atguigu.product.entity.BrandEntity;
import com.atguigu.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= GulimallProductApplication.class)
public class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

//    @Test
//    public void contextLoads() {
//        BrandEntity brandEntity=new BrandEntity();
//        brandEntity.setName("测试");
//        brandService.save(brandEntity);
//    }

}
