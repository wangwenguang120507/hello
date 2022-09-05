package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class CarInfo {
	/**
	 * 所有車コード
	 */
	private String ownercd;
	
	/**
	 * 登録№-陸運支局
	 */
	private String tnrikuun;
	
	/**
	 * 登録№-分類番号
	 */
	private String tnbunban;

	/**
	 * 登録№-用途
	 */
	private String tnyouto;
	
	/**
	 * 登録№-一連指定番号
	 */
	private String tnichiren;
	
	/**
	 * 車台番号
	 */
	private String carno;
	
	/**
	 * 型式指定番号
	 */
	private String typekbn;
	
	/**
	 * 類別区分
	 */
	private String ruikbn;
	
	/**
	 * 初度登録年
	 */
	private String ftorokuy;
	
	/**
	 * メーカー
	 */
	private String maker;
	
	/**
	 * 車名コード
	 */
	private String syacd;
	
	/**
	 * 車体色
	 */
	private String color;
	
	/**
	 * 型式
	 */
	private String model;
	
	/**
	 * 年式
	 */
	private String year;
	
	/**
	 * 車検満了日
	 */
	private String manymd;
	
	/**
	 * 任意保険
	 */
	private String hoken;
	
	/**
	 * 原動機の型式
	 */
	private String gtype;
	
	/**
	 * オイル抜き方
	 */
	private String oilnuki;
	
	/**
	 * 会員特典
	 */
	private String mbrtoku;
	
	/**
	 * オイル交換推奨日
	 */
	private String oilchgymd;
	
	/**
	 * バッテリー交換推奨日
	 */
	private String batchgymd;
	
	/**
	 * タイヤ交換推奨日
	 */
	private String tirechgymd;
	
	/**
	 * 夏タイヤ(残り溝)
	 */
	private String tire;
	
	/**
	 * 冬タイヤ(残り溝)
	 */
	private String hoile;
	
	/**
	 * 鈑金見積発行
	 */
	private String av;
	
	/**
	 * 走行距離
	 */
	private String mil;
	
	/**
	 * 最終作業日
	 */
	private String lastsagymd;
	
	/**
	 * 仮削除フラグ
	 */
	private String kdelflg;
	
	/**
	 * 作成日
	 */
	private String crtymd;
	
	/**
	 * 更新日
	 */
	private String updymd;
	
	/**
	 * 更新時刻
	 */
	private String updhms;
	
	/**
	 * 告知フラグ
	 */
	private String kokflg;
	
	/**
	 * 告知年月日
	 */
	private String kokymd;
	
	/**
	 * 告知店舗コード
	 */
	private String koktencd;
	
	/**
	 * 見積フラグ
	 */
	private String mitflg;
	
	/**
	 * 見積年月日
	 */
	private String mitymd;
	
	/**
	 * 見積店舗コード
	 */
	private String mittencd;
	
	/**
	 * 本予約フラグ
	 */
	private String honflg;
	
	/**
	 * 本予約年月日
	 */
	private String honymd;
	
	/**
	 * 本予約店舗コード
	 */
	private String hontencd;
	
	/**
	 * 入庫フラグ
	 */
	private String nyuflg;
	
	/**
	 * 入庫年月日
	 */
	private String nyuymd;
	
	/**
	 * 入庫店舗コード
	 */
	private String nyutencd;
	
	/**
	 * 所有車件数
	 */
	private String carcount;

}
