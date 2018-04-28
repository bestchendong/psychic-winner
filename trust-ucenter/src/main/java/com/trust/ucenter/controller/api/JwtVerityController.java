package com.trust.ucenter.controller.api;

import com.alibaba.fastjson.JSONObject;
import com.trust.ucenter.utils.special.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/jwt")
public class JwtVerityController {

    @RequestMapping("/verity")
    public String verity(@RequestParam(value = "jwt", required = true) String jwt){
        System.out.println("in JwtVerityController verity:"+jwt);
        JSONObject jsonObject = new JSONObject();

        if(JwtUtil.parseJWT(jwt) ==null){
            jsonObject.put("code","500");
            jsonObject.put("msg","false");
            jsonObject.put("data","");
//            return "success";
        }else{
            Claims claims = JwtUtil.parseJWT(jwt);
            Integer userId = (Integer) claims.get("userId");
            jsonObject.put("code","200");
            jsonObject.put("msg","success");
            jsonObject.put("data",userId);
//            return "false";
        }
        return jsonObject.toString();
    }
}
