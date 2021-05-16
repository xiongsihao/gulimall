package com.atguigu.product.dao;

import com.atguigu.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author xiongsihao
 * @email xsh2668028614@qq.com
 * @date 2021-05-15 22:06:10
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
