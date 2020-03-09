package com.cmall.provider.service.impl;


import com.cmall.core.support.BaseService;
import com.cmall.provider.model.entity.UacUserMenu;
import com.cmall.provider.service.UacUserMenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The class Uac user menu service.
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UacUserMenuServiceImpl extends BaseService<UacUserMenu> implements UacUserMenuService {
}
