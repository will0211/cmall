
package com.cmall.provider.web.rpc;

import com.cmall.core.support.BaseController;
import com.cmall.provider.service.MdcProductCategoryFeignApi;
import io.swagger.annotations.Api;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

/**
 * The class Mdc product category feign client.
 *
 */
@RefreshScope
@RestController
@Api(value = "API - MdcProductCategoryFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MdcProductCategoryFeignClient extends BaseController implements MdcProductCategoryFeignApi {
}
