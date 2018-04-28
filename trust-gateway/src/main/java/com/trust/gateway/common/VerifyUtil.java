package com.trust.gateway.common;

/**
 * @author Bob.Zhu
 *
 */
public class VerifyUtil {

//	static String[] urls = new String[]{"/product/product/v1/productImg/",
//			"/product/product/v1/spec/"};
//	static String[] urls = new String[]{"/user/user/tologin","/user/user/test","/user/user/login","/user/user/defaultKaptcha","/user/user/imgvrifyControllerDefaultKaptcha"};
    static String[] urls = new String[]{};
	public static boolean valiToken(String path) {
        boolean bool = false;
        for (String url : urls) {
            if (path.contains(url)) {
                bool = true;
                break;
            }
        }
        return bool;
    }
}
