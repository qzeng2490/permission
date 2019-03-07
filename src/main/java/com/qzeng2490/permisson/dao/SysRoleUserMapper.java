package com.qzeng2490.permisson.dao;

import com.qzeng2490.permisson.model.SysRoleUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

public interface SysRoleUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleUser record);

    int insertSelective(SysRoleUser record);

    SysRoleUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleUser record);

    int updateByPrimaryKey(SysRoleUser record);
}