package com.ssm.mapper;

import com.ssm.pojo.PcsUserrole;
import com.ssm.pojo.PcsUserroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcsUserroleMapper {
    int countByExample(PcsUserroleExample example);

    int deleteByExample(PcsUserroleExample example);

    int deleteByPrimaryKey(String pcsUuid);

    int insert(PcsUserrole record);

    int insertSelective(PcsUserrole record);

    List<PcsUserrole> selectByExample(PcsUserroleExample example);

    PcsUserrole selectByPrimaryKey(String pcsUuid);

    int updateByExampleSelective(@Param("record") PcsUserrole record, @Param("example") PcsUserroleExample example);

    int updateByExample(@Param("record") PcsUserrole record, @Param("example") PcsUserroleExample example);

    int updateByPrimaryKeySelective(PcsUserrole record);

    int updateByPrimaryKey(PcsUserrole record);
}