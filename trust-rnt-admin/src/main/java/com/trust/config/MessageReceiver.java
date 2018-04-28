package com.trust.config;

import org.springframework.stereotype.Component;

/**redis 消息处理器*/
@Component
public class MessageReceiver {
//    @Autowired
//    RntUserService rntUserService;
//
//    /**接收消息的方法*/
//    public void receiveMessage(String message){
//        message = message.replaceAll("\\\\","");
//        message = message.substring(1,message.length()-1);
//        System.out.println("message:"+message);
//        JSONObject jsonObject = JSON.parseObject(message);
//        System.out.println("接收到的通道消息："+jsonObject.getInteger("userId"));
//        RntUser rntUser = new RntUser();
//        rntUser.setUserId(jsonObject.getInteger("userId"));
//        rntUser.setNickname(jsonObject.getString("nickname"));
//        rntUser.setPhone(jsonObject.getString("phone"));
//        rntUser.setRealnameStatus(jsonObject.getInteger("realnameStatus"));
//        rntUserService.insertRntUser(rntUser);
//
//    }

}