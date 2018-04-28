package com.trust.service;

import com.trust.entity.api.PriceQuotes;
import com.trust.entity.cms.CmsPriceQuotes;

import java.util.List;
import java.util.Map;

/**
 * @Author Yangcb
 * @Descrintion
 * @Date create 2017-12-20 13:45
 * @Version 1.0
 */
public interface CmsPriceQuotesService {

    List<CmsPriceQuotes> getCmsPriceQuotesList();

    CmsPriceQuotes findPriceQuotesById(long id);

    void save(CmsPriceQuotes cmsPriceQuotes);

    void edit(CmsPriceQuotes cmsPriceQuotes);

    void delete(long id);

    Map<String,Object> getPriceQuotesList();

    List<PriceQuotes> getPriceQuotesListByCategoryCode(String categoryCode);
}
