package com.ssm.mapper;

import com.ssm.pojo.PcsRole;
import com.ssm.pojo.PcsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcsRoleMapper {
    int countByExample(PcsRoleExample example);

    int deleteByExample(PcsRoleExample example);

    int deleteByPrimaryKey(String pcsUuid);

    int insert(PcsRole record);

    int insertSelective(PcsRole record);

    List<PcsRole> selectByExample(PcsRoleExample example);

    PcsRole selectByPrimaryKey(String pcsUuid);

    int updateByExampleSelective(@Param("record") PcsRole record, @Param("example") PcsRoleExample example);

    int updateByExample(@Param("record") PcsRole record, @Param("example") PcsRoleExample example);

    int updateByPrimaryKeySelective(PcsRole record);

    int updateByPrimaryKey(PcsRole record);
}