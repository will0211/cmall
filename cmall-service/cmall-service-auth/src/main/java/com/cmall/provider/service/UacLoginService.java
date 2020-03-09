
package com.cmall.provider.service;


import com.cmall.provider.model.dto.user.LoginRespDto;

/**
 * The interface Uac login service.
 *
 */
public interface UacLoginService {

	/**
	 * Login after login resp dto.
	 *
	 * @param applicationId the application id
	 *
	 * @return the login resp dto
	 */
	LoginRespDto loginAfter(Long applicationId);

}
