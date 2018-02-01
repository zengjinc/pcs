package com.ssm.mapper;

import com.ssm.pojo.PcsAudit;
import com.ssm.pojo.PcsAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcsAuditMapper {
    int countByExample(PcsAuditExample example);

    int deleteByExample(PcsAuditExample example);

    int deleteByPrimaryKey(String pcsUuid);

    int insert(PcsAudit record);

    int insertSelective(PcsAudit record);

    List<PcsAudit> selectByExample(PcsAuditExample example);

    PcsAudit selectByPrimaryKey(String pcsUuid);

    int updateByExampleSelective(@Param("record") PcsAudit record, @Param("example") PcsAuditExample example);

    int updateByExample(@Param("record") PcsAudit record, @Param("example") PcsAuditExample example);

    int updateByPrimaryKeySelective(PcsAudit record);

    int updateByPrimaryKey(PcsAudit record);
}