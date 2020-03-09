
package com.cmall.provider.web.admin;


import com.cmall.base.dto.LoginAuthDto;
import com.cmall.core.annotation.LogAnnotation;
import com.cmall.core.support.BaseController;
import com.cmall.provider.model.dto.user.UserModifyPwdDto;
import com.cmall.provider.model.dto.user.UserRegisterDto;
import com.cmall.provider.service.UacUserService;
import com.cmall.wrapper.WrapMapper;
import com.cmall.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * 用户密码.
 *
 */
@RestController
@RequestMapping(value = "/user", produces = {"application/json;charset=UTF-8"})
@Api(value = "Web - UacUserPasswordController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UacUserPasswordController extends BaseController {
	@Resource
	private UacUserService uacUserService;

	/**
	 * 用户修改密码
	 *
	 * @param userModifyPwdDto the user modify pwd dto
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/modifyUserPwd")
	@LogAnnotation
	@ApiOperation(httpMethod = "POST", value = "用户修改密码")
	public Wrapper<Integer> modifyUserPwd(@ApiParam(name = "userModifyPwdDto", value = "用户修改密码Dto") @RequestBody UserModifyPwdDto userModifyPwdDto) {
		logger.info("==》vue用户修改密码, userModifyPwdDto={}", userModifyPwdDto);

		logger.info("旧密码 oldPassword = {}", userModifyPwdDto.getOldPassword());
		logger.info("新密码 newPassword = {}", userModifyPwdDto.getNewPassword());
		logger.info("登录名 loginName = {}", userModifyPwdDto.getLoginName());

		LoginAuthDto loginAuthDto = getLoginAuthDto();

		int result = uacUserService.userModifyPwd(userModifyPwdDto, loginAuthDto);
		return handleResult(result);
	}


	/**
	 * 注册
	 *
	 * @param registerDto the register dto
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/registerUser")
	@ApiOperation(httpMethod = "POST", value = "注册新用户")
	public Wrapper registerUser(@ApiParam(name = "registerDto", value = "用户注册Dto") @RequestBody UserRegisterDto registerDto) {
		logger.info("vue注册开始。注册参数：{}", registerDto);
		uacUserService.register(registerDto);
		return WrapMapper.ok("注册成功");
	}
}
