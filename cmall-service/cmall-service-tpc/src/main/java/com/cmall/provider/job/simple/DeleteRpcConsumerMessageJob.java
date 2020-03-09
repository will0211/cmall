
package com.cmall.provider.job.simple;

import com.alibaba.fastjson.JSON;
import com.cmall.config.properties.CmallProperties;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.cmall.base.constant.AliyunMqTopicConstants;
import com.cmall.base.dto.ShardingContextDto;
import com.cmall.core.generator.UniqueIdGenerator;
import com.cmall.elastic.lite.annotation.ElasticJobConfig;
import com.cmall.provider.model.dto.TpcMqMessageDto;
import com.cmall.provider.service.TpcMqMessageService;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * 定时清理所有订阅者消费成功的消息数据.
 *
 */
@Slf4j
@ElasticJobConfig(cron = "0 0 0 1/1 * ?")
public class DeleteRpcConsumerMessageJob implements SimpleJob {
	@Resource
	private CmallProperties cmallProperties;
	@Resource
	private TpcMqMessageService tpcMqMessageService;

	/**
	 * Execute.
	 *
	 * @param shardingContext the sharding context
	 */
	@Override
	public void execute(final ShardingContext shardingContext) {
		ShardingContextDto shardingContextDto = new ShardingContextDto(shardingContext.getShardingTotalCount(), shardingContext.getShardingItem());
		final TpcMqMessageDto message = new TpcMqMessageDto();
		message.setMessageBody(JSON.toJSONString(shardingContextDto));
		message.setMessageTag(AliyunMqTopicConstants.MqTagEnum.DELETE_CONSUMER_MESSAGE.getTag());
		message.setMessageTopic(AliyunMqTopicConstants.MqTopicEnum.TPC_TOPIC.getTopic());
		message.setProducerGroup(cmallProperties.getAliyun().getRocketMq().getProducerGroup());
		String refNo = Long.toString(UniqueIdGenerator.generateId());
		message.setRefNo(refNo);
		message.setMessageKey(refNo);
		tpcMqMessageService.saveAndSendMessage(message);
	}
}
