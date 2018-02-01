package com.ssm.mapper;

import com.ssm.pojo.PcsUser;
import com.ssm.pojo.PcsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcsUserMapper {
    int countByExample(PcsUserExample example);

    int deleteByExample(PcsUserExample example);

    int deleteByPrimaryKey(String pcsUuid);

    int insert(PcsUser record);

    int insertSelective(PcsUser record);

    List<PcsUser> selectByExample(PcsUserExample example);

    PcsUser selectByPrimaryKey(String pcsUuid);

    int updateByExampleSelective(@Param("record") PcsUser record, @Param("example") PcsUserExample example);

    int updateByExample(@Param("record") PcsUser record, @Param("example") PcsUserExample example);

    int updateByPrimaryKeySelective(PcsUser record);

    int updateByPrimaryKey(PcsUser record);
}