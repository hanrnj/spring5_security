package edu.bit.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.bit.ex.service.UserService;
import edu.bit.ex.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@AllArgsConstructor
public class UserController {
	
	private UserService userService;
	
	@GetMapping("/user/userForm")
	public void userForm() {
		log.info("userForm...");	
	}
	
	@PostMapping("/user/addUser")
	public String addUser(UserVO userVO) {
		log.info("addUser...");	
		userService.addUser(userVO);
		return "redirect:/";
	}
	
}
