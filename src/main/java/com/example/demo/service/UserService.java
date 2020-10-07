package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;

/**
 * Spring勉強用モデル
 *
 * @author keita
 *
 */
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 *
	 * userテーブルにある全データを取得する
	 *
	 * @return usersテーブルの全データをリストで返す
	 *
	 */

	@Transactional(readOnly = true)
	public List<User> findAll() {
		return userMapper.findAll();
	}

}
