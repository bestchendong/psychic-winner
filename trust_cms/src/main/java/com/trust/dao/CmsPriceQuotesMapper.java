package com.trust.dao;

import com.trust.entity.api.PriceQuotes;
import com.trust.entity.cms.CmsPriceQuotes;
import com.trust.entity.cms.CmsPriceQuotesExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface CmsPriceQuotesMapper {
    int countByExample(CmsPriceQuotesExample example);

    int deleteByExample(CmsPriceQuotesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsPriceQuotes record);

    int insertSelective(CmsPriceQuotes record);

    List<CmsPriceQuotes> selectByExample(CmsPriceQuotesExample example);

    CmsPriceQuotes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsPriceQuotes record, @Param("example") CmsPriceQuotesExample example);

    int updateByExample(@Param("record") CmsPriceQuotes record, @Param("example") CmsPriceQuotesExample example);

    int updateByPrimaryKeySelective(CmsPriceQuotes record);

    int updateByPrimaryKey(CmsPriceQuotes record);

    List<PriceQuotes> getPriceQuotesList();

    List<PriceQuotes> getPriceQuotesListByCategoryCode(String categoryCode);
}