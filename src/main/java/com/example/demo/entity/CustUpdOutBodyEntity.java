package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class CustUpdOutBodyEntity {
	/**
	 * 入力件数
	 */
	private int inputcnt;

	/**
	 * 会員登録件数
	 */
	private int custregistcnt;

	/**
	 * 会員更新件数
	 */
	private int custupdcnt;

	/**
	 * 会員削除件数
	 */
	private int custdelcnt;

	/**
	 * スキップ件数
	 */
	private int skipcnt;

}
