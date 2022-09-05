package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class CustRefInBodyEntity {
	/**
	 * 顧客コード
	 */
	private String custcd;

	/**
	 * 所有車情報取得フラグ 0:所有車リクエスト無し, 1:所有車リクエスト有り
	 */
	private String carinfogetflg;
	
	/**
	 * 所有車コード
	 */
	private String ownercd;
	
	/**
	 * 所有車情報一覧取得フラグ
	 */
	private String carlistgetflg;
}
