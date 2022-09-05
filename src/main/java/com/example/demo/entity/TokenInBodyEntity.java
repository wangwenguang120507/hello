package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class TokenInBodyEntity {
	/**
	 * クライアント識別子
	 */
	private String client_id;
	
	/**
	 * APIトークン生成用共通鍵
	 */
	private String signin_key;
	
	/**
	 * ログインパスワード
	 */
	private String syspasswd;
}
