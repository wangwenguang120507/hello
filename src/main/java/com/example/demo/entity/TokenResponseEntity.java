package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class TokenResponseEntity {
	/**
	 * ヘッダ部
	 */
	private HeadEntity heads;
	
	/**
	 * ボディ部
	 */
	private String body;
	
	/**
	 * エラー部
	 */
	private ErrorEntity error;
}
