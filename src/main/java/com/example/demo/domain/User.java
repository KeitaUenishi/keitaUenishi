package com.example.demo.domain;

import lombok.Data;

/**
 *
 * Spring Boot勉強用モデル
 * UsersテーブルのデータをマッピングするためのEntity
 * getter setterはlombokの@Dataが自動的に生成してくれる
 *
 * @author keita
 *
 */

@Data
public class User {

	private String id;
	private String user;
	private String email;
	private String address;
	private boolean sex;
	private String remark;

}
