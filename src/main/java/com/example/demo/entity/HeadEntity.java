package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class HeadEntity {
	/**
	 * 会社コード(01固定)
	 */
	private String kaisyacd;
	
	/**
	 * リクエスト日付
	 */
	private String reqymd;
	
	/**
	 * リクエスト時間
	 */
	private String reqtm;
	
	/**
	 * 店舗コード
	 */
	private String tencd;
	
	/**
	 * 端末No
	 */
	private String tanmatsuno;
	
	/**
	 * 処理通番
	 */
	private String prcno;
	
	/**
	 * リクエスト番号
	 */
	private String reqno;
	
	/**
	 * リクエストしたシステム(1:Webシステム、2:作業受付支援システム)
	 */
	private String reqsystem;
	
	/**
	 * リクエストしたプログラム
	 */
	private String reqprogram;

}
