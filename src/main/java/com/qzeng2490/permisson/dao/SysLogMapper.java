package com.qzeng2490.permisson.dao;

import com.qzeng2490.permisson.beans.PageQuery;
import com.qzeng2490.permisson.dto.SearchLogDto;
import com.qzeng2490.permisson.model.SysLog;
import com.qzeng2490.permisson.model.SysLogWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SysLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysLogWithBLOBs record);

    int insertSelective(SysLogWithBLOBs record);

    SysLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysLogWithBLOBs record);

    int updateByPrimaryKey(SysLog record);

    int countBySearchDto(@Param("dto") SearchLogDto dto);

    List<SysLogWithBLOBs> getPageListBySearchDto(@Param("dto") SearchLogDto dto, @Param("page") PageQuery page);
}