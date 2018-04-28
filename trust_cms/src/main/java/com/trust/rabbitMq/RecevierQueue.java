/*
package com.trust.rabbitMq;

import com.alibaba.fastjson.JSONObject;
import com.trust.entity.cms.CmsArticleCategory;
import com.trust.entity.cms.CmsArticleInfo;
import com.trust.service.CmsArticleCategoryService;
import com.trust.service.CmsArticleInfoService;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

*/
/**
 * @Author Yangcb
 * @Descrintion
 * @Date create 2017-11-24 16:19
 * @Version 1.0
 *//*

@Component
public class RecevierQueue {
    @Autowired
    private CmsArticleInfoService  cmsArticleInfoService;
    @Autowired
    private CmsArticleCategoryService cmsArticleCategoryService;
    //使用@RabbitListener监听指定队列、指定exchange、指定routingKey的消息
    //同时@RabbitListener有建立队列、exchange、routingKey的功能
    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "news_zcfg" , durable = "true") ,
                    exchange = @Exchange(value = "trust_cms" , type = "topic" , durable = "true") ,
                    key = "news_zcfg")
    )
    //解析队列信息
    public void receiveMessage(byte[] message) {
       try {
            String articleInfo = new String(message);
            JSONObject json = JSONObject.parseObject(articleInfo);
            if(json!=null){
                if(json.getBoolean("article_category_code")){
                    CmsArticleCategory cmsArticleCategory = cmsArticleCategoryService.getCategoryByCode(json.get("article_category_code").toString());
                    if(cmsArticleCategory!=null){//判断该分类是否存在不存在新建

                    }
                }
                CmsArticleInfo cmsarticleInfo = new CmsArticleInfo();
                cmsarticleInfo.setArticleContents(null);
            }
            //进行更新
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("数据解析异常");
        }
    }
}
*/
