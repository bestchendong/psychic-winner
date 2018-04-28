package com.trust.controller.api;

import com.trust.service.CmsPriceQuotesService;
import com.trust.utils.ResultData;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")
/**
 * 价格行情api
 */
@Controller
public class PricequotesApiController implements PricequotesApi {

    @Autowired
    private CmsPriceQuotesService cmsPriceQuotesService;

    public ResultData getPriceQuotesByparams(@ApiParam(value = "城市编码") @RequestParam(value = "city", required = false) String city,
                                             @ApiParam(value = "系统编码") @RequestParam(value = "sysCode", required = false) String sysCode) {
        return  new ResultData("200","success",cmsPriceQuotesService.getPriceQuotesList());
    }

}
