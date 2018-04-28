package com.trust.ucenter.utils.result;

public class Response {
	/** 返回信息码*/
	private String code="200";
	/** 返回信息内容*/
	private String msg="操作成功";

	public Response() {
	}
	
	public Response(ExceptionMsg msg){
		this.code=msg.getCode();
		this.msg=msg.getMsg();
	}
	
	public Response(String code) {
		this.code = code;
		this.msg = "";
	}

	public Response(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public String getcode() {
		return code;
	}
	public void setcode(String code) {
		this.code = code;
	}
	public String getmsg() {
		return msg;
	}
	public void setmsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Response{" +
				"code='" + code + '\'' +
				", msg='" + msg + '\'' +
				'}';
	}
}
