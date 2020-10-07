package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UserService;

/**
 *
 * Spring勉強用コントローラー
 * @author keita
 *
 */

@Controller
@RequestMapping("/users")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;

	/**
	 *
	 * userテーブルからデータを取得する ->モデル
	 * user.htmlに返す ->ビュー
	 *
	 * @param model users.htmlへデータを持っていく
	 * @return users.htmlへ遷移
	 *
	 */

	@GetMapping
	public String findAll(Model model) {

		model.addAttribute("users", userService.findAll());

		//usersテーブルのデータをログに出力
		logger.info("[usersテーブルの中身]" + model.getAttribute("users").toString());

		return "users";
	}
}
