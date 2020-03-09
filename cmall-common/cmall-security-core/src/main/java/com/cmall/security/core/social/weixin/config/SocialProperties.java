package com.cmall.security.core.social.weixin.config;

/**
 * 项目名称：SpringCloud搭建企业级分布式微服务平台
 * 类名称：SocialProperties
 * 创建人：半兽人
 * 联系方式：44110695@qq.com
 * 官网: www.chilangedu.com
 */
public class SocialProperties {
    private String appId;
    private String appSecret;

    public SocialProperties() {
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return this.appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
