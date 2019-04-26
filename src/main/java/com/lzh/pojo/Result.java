package com.lzh.pojo;

import com.lzh.pojo.Photo.PhotoBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Result {
	private int code;
	private String msg;
	private Object data;
	
	public static Result ok() {
		return Result.builder().code(200).msg("请求成功").build();
	}
	public static Result ok(String msg) {
		return Result.builder().code(200).msg(msg).build();
	}
	public static Result ok(Object data) {
		return Result.builder().code(200).msg("请求成功").data(data).build();
	}
	public static Result error() {
		return Result.builder().code(500).msg("请求失败").build();
	}
	public static Result error(String msg) {
		return Result.builder().code(500).msg(msg).build();
	}
	
	
}
