
package com.cmall.provider.web.rpc;

import com.cmall.core.support.BaseController;
import com.cmall.provider.service.OmcOrderDetailFeignApi;
import io.swagger.annotations.Api;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

/**
 * The class Omc order detail feign client.
 *
 */
@RefreshScope
@RestController
@Api(value = "API - OmcOrderDetailFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class OmcOrderDetailFeignClient extends BaseController implements OmcOrderDetailFeignApi {

}
