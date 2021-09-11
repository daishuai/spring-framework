package com.daishuai.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Daishuai
 */
@Service
public class UserService {

	@Autowired
	private IndexService indexService;

	public UserService () {
		System.out.println("Constructor From UserService ...");
	}
}
