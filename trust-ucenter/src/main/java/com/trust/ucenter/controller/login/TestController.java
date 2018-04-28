package com.trust.ucenter.controller.login;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trust.ucenter.entity.UcUser;
import com.trust.ucenter.service.UcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private UcUserService ucUserService;

    //redis缓存
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/user/test")
    public String test() {
        return new Date().toString();
    }

    private static String A = "A";
    private static String B = "B";

    public static  void dealLock(){
        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {

                        synchronized(A){
                            try {
                                Thread.currentThread().sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            synchronized (B){
                                System.out.println("t1");
                            }
                        }
                    }
                }
        );

        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {

                        synchronized(B){
                            try {
                                Thread.currentThread().sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            synchronized (A){
                                System.out.println("t2");
                            }
                        }
                    }
                }
        );
        t1.start();
        t2.start();
    }

    public static void main(String[] args){
        dealLock();
    }
}
