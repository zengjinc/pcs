package com.ssm.mapper;

import com.ssm.pojo.PcsListener;
import com.ssm.pojo.PcsListenerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PcsListenerMapper {
    int countByExample(PcsListenerExample example);

    int deleteByExample(PcsListenerExample example);

    int deleteByPrimaryKey(String pcsUuid);

    int insert(PcsListener record);

    int insertSelective(PcsListener record);

    List<PcsListener> selectByExample(PcsListenerExample example);

    PcsListener selectByPrimaryKey(String pcsUuid);

    int updateByExampleSelective(@Param("record") PcsListener record, @Param("example") PcsListenerExample example);

    int updateByExample(@Param("record") PcsListener record, @Param("example") PcsListenerExample example);

    int updateByPrimaryKeySelective(PcsListener record);

    int updateByPrimaryKey(PcsListener record);
}