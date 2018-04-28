package com.trust.shiro;
import com.trust.entity.admin.Manager;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
*@Author Yangcb
*@Descrintion Shiro 工具操作
*@Date create 2018/3/21 17:10
*@Version 1.0
*/
public class ShiroUtils {
	public static Subject getSubjct() { return SecurityUtils.getSubject(); }
	public static Manager getUser() { return (Manager)getSubjct().getPrincipal(); }
	public static Integer getUserId() { return getUser().getManagerId(); }
	public static void logout() {
		getSubjct().logout();
	}
}
