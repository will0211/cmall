
package com.cmall.provider.job.simple;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.cmall.elastic.lite.annotation.ElasticJobConfig;
import com.cmall.provider.service.OpcRpcService;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * 定时清理无效OSS文件.
 *
 */
@Slf4j
@ElasticJobConfig(cron = "0 0 0 1/1 * ?")
public class DeleteRpcExpireFileJob implements SimpleJob {

	@Resource
	private OpcRpcService opcRpcService;

	/**
	 * Execute.
	 *
	 * @param shardingContext the sharding context
	 */
	@Override
	public void execute(final ShardingContext shardingContext) {
		opcRpcService.deleteExpireFile();
	}
}
