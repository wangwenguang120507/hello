package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class CustRefParamsEntity {

	/**
	 * ヘッダ部
	 */
	private HeadEntity head;

	/**
	 * ボディ部
	 */
	private String body;

	/**
	 * エラー部
	 */
	private ErrorEntity error;
}
