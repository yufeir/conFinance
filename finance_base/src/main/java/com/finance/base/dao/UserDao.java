package com.finance.base.dao;

import com.finance.base.pojo.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author sanzu
 * @email lxf@atguigu.com
 * @date 2020-02-25 16:33:58
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
