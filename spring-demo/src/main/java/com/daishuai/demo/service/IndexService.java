package com.daishuai.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Daishuai
 */
@Service
public class IndexService {

	@Autowired
	private UserService userService;

	public IndexService() {
		System.out.println("Constructor From IndexService ...");
	}
}
