package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class CarlistArray {
	/**
	  * 所有車コード
	  */
	private String ownercd;
	/**
	  * 所有車コード
	  */
	private String ownercd1;
	
	/**
	  * 登録№-一連指定番号
	  */
	private String tnichiren;
	
	/**
	  * メーカー
	  */
	private String maker;
	
	/**
	  * 車名コード
	  */
	private String syacd;
	
	/**
	  * 車検満了日
	  */
	private String manymd;
	
	/**
	  * 会員特典
	  */
	private String mbrtoku;
	
	/**
	  * 作成日
	  */
	private String crtymd;
	
	/**
	  * 通番
	  */
	private String no;
}
