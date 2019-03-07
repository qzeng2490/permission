package com.qzeng2490.permisson.dao;

import com.qzeng2490.permisson.model.SysLog;
import com.qzeng2490.permisson.model.SysLogWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

public interface SysLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysLogWithBLOBs record);

    int insertSelective(SysLogWithBLOBs record);

    SysLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysLogWithBLOBs record);

    int updateByPrimaryKey(SysLog record);
}