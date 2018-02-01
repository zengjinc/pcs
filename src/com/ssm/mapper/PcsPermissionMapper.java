package com.ssm.mapper;

import com.ssm.pojo.PcsPermission;
import com.ssm.pojo.PcsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcsPermissionMapper {
    int countByExample(PcsPermissionExample example);

    int deleteByExample(PcsPermissionExample example);

    int deleteByPrimaryKey(String pcsUuid);

    int insert(PcsPermission record);

    int insertSelective(PcsPermission record);

    List<PcsPermission> selectByExample(PcsPermissionExample example);

    PcsPermission selectByPrimaryKey(String pcsUuid);

    int updateByExampleSelective(@Param("record") PcsPermission record, @Param("example") PcsPermissionExample example);

    int updateByExample(@Param("record") PcsPermission record, @Param("example") PcsPermissionExample example);

    int updateByPrimaryKeySelective(PcsPermission record);

    int updateByPrimaryKey(PcsPermission record);
}