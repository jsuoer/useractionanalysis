package com.wf.user.dao;

import com.wf.user.model.BuyerOrExpert;
import com.wf.user.model.BuyerOrExpertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyerOrExpertMapper {
    int countByExample(BuyerOrExpertExample example);

    int deleteByExample(BuyerOrExpertExample example);

    int deleteByPrimaryKey(String id);

    int insert(BuyerOrExpert record);

    int insertSelective(BuyerOrExpert record);

    List<BuyerOrExpert> selectByExample(BuyerOrExpertExample example);

    BuyerOrExpert selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BuyerOrExpert record, @Param("example") BuyerOrExpertExample example);

    int updateByExample(@Param("record") BuyerOrExpert record, @Param("example") BuyerOrExpertExample example);

    int updateByPrimaryKeySelective(BuyerOrExpert record);

    int updateByPrimaryKey(BuyerOrExpert record);
}