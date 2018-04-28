package com.trust.admin.mgt.shiro;
import com.trust.admin.mgt.entity.Manager;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * shiro权限
 */
public class ShiroUtils {
	public static Subject getSubjct() { return SecurityUtils.getSubject(); }
	public static Manager getUser() { return (Manager)getSubjct().getPrincipal(); }
	public static Integer getUserId() { return getUser().getManagerId(); }
	public static void logout() {
		getSubjct().logout();
	}
}
