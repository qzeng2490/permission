package com.qzeng2490.permisson.dao;

import com.qzeng2490.permisson.model.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}