package com.trust.controller;

import com.trust.controller.api.PricequotesApi;
import com.trust.service.PriceQuotesService;
import com.trust.utils.Result;
import com.trust.utils.ResultData;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")
/**
 * 价格行情api
 */
@RestController
public class PricequotesApiController implements PricequotesApi {

    @Autowired
    private PriceQuotesService cmsPriceQuotesService;

    public Result getPriceQuotesByparams(@ApiParam(value = "城市编码") @RequestParam(value = "city", required = false) String city,
                                         @ApiParam(value = "系统编码") @RequestParam(value = "sysCode", required = false) String sysCode) {
        Result resultData = cmsPriceQuotesService.getPriceQuotesByparams(city,sysCode);
        if(resultData!=null){
          return resultData;
        }
         return  new ResultData("200","success",null);
    }
}
