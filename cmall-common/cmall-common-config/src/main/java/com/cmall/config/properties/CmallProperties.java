
package com.cmall.config.properties;


import com.cmall.base.constant.GlobalConstant;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 项目名称：SpringCloud搭建企业级分布式微服务平台
 * 类名称：CmallProperties.java
 * 创建人：半兽人
 * 联系方式：44110695@qq.com
 * 官网: www.chilangedu.com
 */
@Data
@ConfigurationProperties(prefix = GlobalConstant.ROOT_PREFIX)
public class CmallProperties {
	private ReliableMessageProperties message = new ReliableMessageProperties();
	private AliyunProperties aliyun = new AliyunProperties();
	private AsyncTaskProperties task = new AsyncTaskProperties();
	private SwaggerProperties swagger = new SwaggerProperties();
	private QiniuProperties qiniu = new QiniuProperties();
	private GaodeProperties gaode = new GaodeProperties();
	private JobProperties job = new JobProperties();
	private ZookeeperProperties zk = new ZookeeperProperties();
}
