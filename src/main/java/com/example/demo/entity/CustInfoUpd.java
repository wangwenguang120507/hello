package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class CustInfoUpd {
	/**
	 * 顧客コード
	 */
	private String custcd;
	
	/**
	 * 氏名(漢字)
	 */
	private String seikj;
	
	/**
	 * 氏名(フリガナ)
	 */
	private String seikn;
	
	/**
	 * 性別	
	 */
	private String sex;
	
	/**
	 * 生年月日
	 */
	private String birthday;
	
	/**
	 * 郵便番号
	 */
	private String postno;
	
	/**
	 * 住所1	
	 */
	private String addr1;
	
	/**
	 * 住所2
	 */
	private String addr2;
	
	/**
	 * 住所3
	 */
	private String addr3;
	
	/**
	 * 電話番号1
	 */
	private String telno1;
	
	/**
	 * 電話番号2
	 */
	private String telno2;
	
	/**
	 * Eメールアドレス1
	 */
	private String mailaddr1;
	
	/**
	 * Eメールアドレス2
	 */
	private String mailaddr2;
	
	/**
	 * 入会日
	 */
	private String entymd;
	
	/**
	 * 顧客種別
	 */
	private String custtype;
	
	/**
	 * カード有効期限
	 */
	private String cardkigen;
	
	/**
	 * 基準店舗コード(店舗コード)
	 */
	private String ktencd;
	
	/**
	 * 基準店舗コード(号店コード)
	 */
	private String ksyozokcd;
	
	/**
	 * 車検TELコール
	 */
	private String syumi1;
	
	/**
	 * DM発行区分
	 */
	private String dmhkkbn;
	
	/**
	 * DM最終発行日	
	 */
	private String dmhkymd;
	
	/**
	 * メルマガ発行区分
	 */
	private String mmhkkbn;
	
	/**
	 * PCメルマガ発行種別
	 */
	private String mmhksyu;
	
	/**
	 * メンテナンスパック有効期限
	 */
	private String oilmbrlmt;
	
	/**
	 * WEBSHOP会員コード
	 */
	private String wcustcd;
	
	/**
	 * WEBSHOP初期パスワード	
	 */
	private String wpasswd;
	
	/**
	 * 旧顧客コード
	 */
	private String oldcustcd;
	
	/**
	 * 会員登録状態フラグ
	 */
	private String kjflg;
	
	/**
	 * メンテナンスパックフラグ
	 */
	private String mpflg;
	
	/**
	 * 更新項目
	 */
	private String updkomoku;
	
}
