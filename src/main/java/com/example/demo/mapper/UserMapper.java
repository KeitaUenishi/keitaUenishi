package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.User;

/**
 *
 * Spring勉強用 モデル
 * @author keita
 *
 */

@Mapper
public interface UserMapper {

	/**
	 *
	 * userテーブルにある全データを取得する
	 *
	 * @return usersテーブルの全データをListで返す
	 *
	 */

	List<User> findAll();

}
