package com.ssm.mapper;

import com.ssm.pojo.PcsTest;
import com.ssm.pojo.PcsTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcsTestMapper {
    int countByExample(PcsTestExample example);

    int deleteByExample(PcsTestExample example);

    int deleteByPrimaryKey(String pcsUuid);

    int insert(PcsTest record);

    int insertSelective(PcsTest record);

    List<PcsTest> selectByExample(PcsTestExample example);

    PcsTest selectByPrimaryKey(String pcsUuid);

    int updateByExampleSelective(@Param("record") PcsTest record, @Param("example") PcsTestExample example);

    int updateByExample(@Param("record") PcsTest record, @Param("example") PcsTestExample example);

    int updateByPrimaryKeySelective(PcsTest record);

    int updateByPrimaryKey(PcsTest record);
}