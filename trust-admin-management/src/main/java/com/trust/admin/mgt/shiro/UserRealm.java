package com.trust.admin.mgt.shiro;
import com.trust.admin.mgt.config.ApplicationContextRegister;
import com.trust.admin.mgt.entity.Manager;
import com.trust.admin.mgt.service.ManagerService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class UserRealm extends AuthorizingRealm {
	@Autowired
	ManagerService managerService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		Integer userId = ShiroUtils.getUserId();
		ManagerService menuService = ApplicationContextRegister.getBean(ManagerService.class);
		Set<String> perms = menuService.getAuthorityKeyOfManager(userId);
		if(perms==null){
			perms = new HashSet<>();
		}
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.setStringPermissions(perms);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal();
		String password = new String((char[]) token.getCredentials());

		ManagerService userMapper = ApplicationContextRegister.getBean(ManagerService.class);
		// 查询用户信息
		Manager user = managerService.getManagerByManagerName(username);
		// 账号不存在
		if (user == null) {
			throw new UnknownAccountException("账号或密码不正确");
		}
		// 密码错误
		if (!password.equals(user.getPassword())) {
			throw new IncorrectCredentialsException("账号或密码不正确");
		}
		// 账号锁定
		if (user.getStatus() == 0) {
			throw new LockedAccountException("账号已被锁定,请联系管理员");
		}
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, password, getName());
		return info;
	}

}
