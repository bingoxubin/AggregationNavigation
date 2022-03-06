package com.bingoabin.bean;

import com.alibaba.fastjson.JSON;

public class Message {

	private Object data;
	private String msg;
	private int status;

	public void setData(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	/**
	 * 将Java中抽象的消息对象转换为JSON格式的字符串
	 *
	 * @return
	 */
	public String toJSON() {
		return JSON.toJSONString(this);
	}

}