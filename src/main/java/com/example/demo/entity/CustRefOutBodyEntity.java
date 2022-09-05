package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class CustRefOutBodyEntity {
	/**
	 * 顧客情報
	 */
	private CustInfo custInfo;
	
	/**
	 * 所有車情報
	 */
	private CarInfo carinfo;

	/**
	 * 所有車情報一覧
	 */
	private CarlistArray carlistArray;
}
