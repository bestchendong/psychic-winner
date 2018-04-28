package com.trust.service.impl;

import com.trust.dao.CmsPriceQuotesMapper;
import com.trust.entity.api.PriceQuotes;
import com.trust.entity.cms.CmsPriceQuotes;
import com.trust.service.CmsPriceQuotesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Yangcb
 * @Descrintion 价格行情service
 * @Date create 2017-12-20 9:47
 * @Version 1.0
 */
@Service("cmsPriceQuotesService")
public class CmsPriceQuotesServiceImpl implements CmsPriceQuotesService{
    @Resource
    private CmsPriceQuotesMapper cmsPriceQuotesMapper;

    /**
     * 获取价格行情列表
     * @return
     */
    @Override
    public List<CmsPriceQuotes> getCmsPriceQuotesList() {
        return null;
    }

    /**
     * 根据ID获取价格行情
     * @param id
     * @return
     */
    @Override
    public CmsPriceQuotes findPriceQuotesById(long id) {
        try {
            return cmsPriceQuotesMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }

    /**
     * 价格行情
     * @param cmsPriceQuotes
     */
    @Override
    public void save(CmsPriceQuotes cmsPriceQuotes) {
        try {
            cmsPriceQuotesMapper.insertSelective(cmsPriceQuotes);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 保存价格行情
     * @param cmsPriceQuotes
     */
    @Override
    public void edit(CmsPriceQuotes cmsPriceQuotes) {
        try {
            cmsPriceQuotesMapper.updateByPrimaryKeySelective(cmsPriceQuotes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据ID删除价格行情
     * @param id
     */
    @Override
    public void delete(long id) {
        try {
            cmsPriceQuotesMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据编码查询价格行情List
     * @return
     */
    @Override
    public List<PriceQuotes> getPriceQuotesListByCategoryCode(String categoryCode) {
        try {
            cmsPriceQuotesMapper.getPriceQuotesListByCategoryCode(categoryCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *移动端返回价格行情list
     * @return
     */
    @Override
    public Map<String,Object> getPriceQuotesList() {
        try {
            Map<String,Object> priceQuotesMap = new HashMap<>();
            List<PriceQuotes> priceQuotesList = cmsPriceQuotesMapper.getPriceQuotesList();
            priceQuotesMap.put("latest",priceQuotesList);
            if(priceQuotesList!=null&&priceQuotesList.size()>0){
                for (PriceQuotes priceQuotes:priceQuotesList) {
                    List<PriceQuotes> categoryPriceQuotesList = cmsPriceQuotesMapper.getPriceQuotesListByCategoryCode(priceQuotes.getCategoryCode());
                    priceQuotesMap.put(priceQuotes.getCategoryCode(),categoryPriceQuotesList);
                }
            }
            return priceQuotesMap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
