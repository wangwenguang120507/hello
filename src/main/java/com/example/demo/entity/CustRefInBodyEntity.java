package com.API.RSSSIDE.entity;

import lombok.Data;

@Data
public class CustRefInBodyEntity {
	/**
	 * �ڋq�R�[�h
	 */
	private String custcd;

	/**
	 * ���L�ԏ��擾�t���O 0:���L�ԃ��N�G�X�g����, 1:���L�ԃ��N�G�X�g�L��
	 */
	private String carinfogetflg;
	
	/**
	 * ���L�ԃR�[�h
	 */
	private String ownercd;
	
	/**
	 * ���L�ԏ��ꗗ�擾�t���O
	 */
	private String carlistgetflg;
}
