package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class CustRefOutEntity {

	/**
	 * ヘッダ部
	 */
	private HeadEntity head;
	
	/**
	 * ボディ部
	 */
	private CustRefOutBodyEntity body;
	
	/**
	 * エラー部
	 */
	private ErrorEntity error;
}
