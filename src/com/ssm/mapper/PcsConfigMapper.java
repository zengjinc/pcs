package com.ssm.mapper;

import com.ssm.pojo.PcsConfig;
import com.ssm.pojo.PcsConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcsConfigMapper {
    int countByExample(PcsConfigExample example);

    int deleteByExample(PcsConfigExample example);

    int deleteByPrimaryKey(String pcsUuid);

    int insert(PcsConfig record);

    int insertSelective(PcsConfig record);

    List<PcsConfig> selectByExample(PcsConfigExample example);

    PcsConfig selectByPrimaryKey(String pcsUuid);

    int updateByExampleSelective(@Param("record") PcsConfig record, @Param("example") PcsConfigExample example);

    int updateByExample(@Param("record") PcsConfig record, @Param("example") PcsConfigExample example);

    int updateByPrimaryKeySelective(PcsConfig record);

    int updateByPrimaryKey(PcsConfig record);
}