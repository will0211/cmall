
package com.cmall.provider.job.simple;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.cmall.elastic.lite.annotation.ElasticJobConfig;
import com.cmall.provider.service.UacRpcService;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * The class Spring simple job.
 *
 */
@Slf4j
@ElasticJobConfig(cron = "0 0/30 * * * ?")
public class HandleUserJwtTokenJob implements SimpleJob {
	@Resource
	private UacRpcService uacRpcService;

	/**
	 * Execute.
	 *
	 * @param shardingContext the sharding context
	 */
	@Override
	public void execute(final ShardingContext shardingContext) {
		uacRpcService.batchUpdateTokenOffLine();
	}
}
