package com.hoaxify.ws.user;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@CrossOrigin//react ile backend portları ayrı olduğu için
	@PostMapping("/api/1.0/users")//1.0 version
	public void createUser(@RequestBody User user) {
			System.out.println(user.toString());
			
	}
}
