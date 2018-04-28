package com.trust.utils;

import java.util.HashMap;
import java.util.Map;

public class Result extends HashMap<String, Object> {

	private static final long serialVersionUID = 1L;

	public Result() {
		put("code", 200);
		put("msg", "操作成功");
	}

	public Result(String code, String msg) {
		put("code", code);
		put("msg", msg);
	}
	public static Result error() {
		return error(500, "操作失败");
	}

	public static Result error(String msg) {
		return error(500, msg);
	}

	public static Result error(int code, String msg) {
		Result r = new Result();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static Result success(String msg) {
		Result r = new Result();
		r.put("msg", msg);
		return r;
	}

	public static Result success(String code, String msg) {
		Result r = new Result();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static Result success(String code, String msg, Object data) {
		Result r = new Result();
		r.put("code", code);
		r.put("msg", msg);
		r.put("data", data);
		return r;
	}

	public static Result success(Map<String, Object> map) {
		Result r = new Result();
		r.putAll(map);
		return r;
	}

	public static Result success() {
		return new Result();
	}

	@Override
	public Result put(String key, Object value) {
		super.put(key, value);
		return this;
	}


}
