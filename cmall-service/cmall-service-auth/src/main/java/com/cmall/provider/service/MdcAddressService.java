
package com.cmall.provider.service;


import com.cmall.provider.model.dto.AddressDTO;

/**
 * The interface Omc order service.
 *
 */
public interface MdcAddressService {
	/**
	 * Gets address by id.
	 *
	 * @param addressId the address id
	 *
	 * @return the address by id
	 */
	AddressDTO getAddressById(Long addressId);
}
