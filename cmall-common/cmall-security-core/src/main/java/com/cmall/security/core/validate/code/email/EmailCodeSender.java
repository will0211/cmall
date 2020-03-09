
package com.cmall.security.core.validate.code.email;

/**
 * The interface Sms code sender.
 *
 */
public interface EmailCodeSender {

	/**
	 * Send.
	 *
	 * @param email the email
	 * @param code  the code
	 */
	void send(String email, String code);

}
