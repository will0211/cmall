
package com.cmall.config;


import com.cmall.config.properties.CmallProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 项目名称：SpringCloud搭建企业级分布式微服务平台
 * 类名称：CmallProperties.java
 * 创建人：半兽人
 * 联系方式：44110695@qq.com
 * 官网: www.chilangedu.com
 */
@Configuration
@EnableConfigurationProperties(CmallProperties.class)
public class CmallCoreConfig {
}
