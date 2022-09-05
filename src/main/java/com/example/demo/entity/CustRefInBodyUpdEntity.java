package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class CustRefInBodyUpdEntity {
	/**
	 * 更新区分　0:新規, 1:修正, 2:削除
	 */
	private String updkbn;
	
	/**
	 * 顧客コード
	 */
	private CustInfoUpd custInfo;
}
