package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class CustUpdOutEntity {

	/**
	 * ヘッダ部
	 */
	private HeadEntity head;

	/**
	 * ボディ部
	 */
	private CustUpdOutBodyEntity body;

	/**
	 * エラー部
	 */
	private ErrorEntity error;
}
