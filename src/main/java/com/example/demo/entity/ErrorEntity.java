package com.API.RSSSIDE.entity;

import java.util.List;

import lombok.Data;

@Data
public class ErrorEntity {
	/**
	 * エラーコード
	 */
	private String errorcd;

	/**
	 * エラー情報
	 */
	private List<ErrorInfo> errors;
}
