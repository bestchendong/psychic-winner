package com.trust.ucenter.utils.special;

import java.security.SecureRandom;

public class RandomString {

	/**
	 * 每位允许的字符
	 */
//	private static final String POSSIBLE_CHARS="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//	private static final String POSSIBLE_CHARS="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String POSSIBLE_CHARS="0123456789";
	
	/**
	 * 生产一个指定长度的随机字符串
	 * @param length 字符串长度
	 * @return
	 */
	public static String generateRandomString(int length) {
		StringBuilder sb = new StringBuilder(length);
		SecureRandom random = new SecureRandom();
		for (int i = 0; i < length; i++) {
			sb.append(POSSIBLE_CHARS.charAt(random.nextInt(POSSIBLE_CHARS.length())));
		}
		return sb.toString();
	}
	
	
}
