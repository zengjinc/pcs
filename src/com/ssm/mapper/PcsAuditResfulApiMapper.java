package com.ssm.mapper;

import com.ssm.pojo.PcsAuditResfulApi;
import com.ssm.pojo.PcsAuditResfulApiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcsAuditResfulApiMapper {
    int countByExample(PcsAuditResfulApiExample example);

    int deleteByExample(PcsAuditResfulApiExample example);

    int deleteByPrimaryKey(String pcsUuid);

    int insert(PcsAuditResfulApi record);

    int insertSelective(PcsAuditResfulApi record);

    List<PcsAuditResfulApi> selectByExample(PcsAuditResfulApiExample example);

    PcsAuditResfulApi selectByPrimaryKey(String pcsUuid);

    int updateByExampleSelective(@Param("record") PcsAuditResfulApi record, @Param("example") PcsAuditResfulApiExample example);

    int updateByExample(@Param("record") PcsAuditResfulApi record, @Param("example") PcsAuditResfulApiExample example);

    int updateByPrimaryKeySelective(PcsAuditResfulApi record);

    int updateByPrimaryKey(PcsAuditResfulApi record);
}