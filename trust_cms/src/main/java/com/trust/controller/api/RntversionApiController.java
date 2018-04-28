package com.trust.controller.api;

import com.trust.entity.api.RntVersion;
import com.trust.service.RntSysVersionService;
import com.trust.utils.ResultData;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")

/**
 * 版本信息Api
 */
@Controller
public class RntversionApiController implements RntversionApi {
    @Autowired
    private RntSysVersionService rntSysVersionService;

    /**
     * 根据名称获取版本信息
     * @param sysName
     * @param sysCode
     * @return
     */
    public ResultData getRntVersionInfo(@NotNull@ApiParam(value = "系统名称 IOS\\Android\\Backstage", required = true) @RequestParam(value = "sysName", required = true) String sysName,
                                        @ApiParam(value = "系统编码：本版本暂无此参数后期多系统或需传入此参数") @RequestParam(value = "sysCode", required = false) String sysCode) {
        if(!"".equals(sysName)&&sysName!=null){
            RntVersion rntVersion = rntSysVersionService.findRntVersionBySysName(sysCode,sysName);
            return new ResultData("200","success",rntVersion);
        }
        return new ResultData("500","paramerror");
    }

}
