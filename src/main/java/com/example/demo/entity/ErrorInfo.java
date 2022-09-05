package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class ErrorInfo {
	/**
	 * エラーID
	 */
	private String errorid;
	
	/**
	 * エラーキー
	 */
	 private String errorkey;
	 
	 /**
	  * エラーメッセージ
	  */
	 private String errormessage;
}
