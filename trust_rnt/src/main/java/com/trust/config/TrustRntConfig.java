package com.trust.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author Yangcb
 * @Descrintion配置
 * @Date create 2018-01-03 19:41
 * @Version 1.0
 */

@Component
@ConfigurationProperties(prefix="oss")
public class TrustRntConfig {

    private String uploadpath;

    private String bucketname;

    public String getUploadpath() { return uploadpath; }

    public void setUploadpath(String uploadpath) { this.uploadpath = uploadpath; }

    public String getBucketname() {
        return bucketname;
    }

    public void setBucketname(String bucketname) {
        this.bucketname = bucketname;
    }

}
