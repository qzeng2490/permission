package com.qzeng2490.permisson.dao;

import com.qzeng2490.permisson.model.SysRoleAcl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

public interface SysRoleAclMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleAcl record);

    int insertSelective(SysRoleAcl record);

    SysRoleAcl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleAcl record);

    int updateByPrimaryKey(SysRoleAcl record);
}