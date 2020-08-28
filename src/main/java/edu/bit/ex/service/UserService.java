package edu.bit.ex.service;

import javax.inject.Inject;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import edu.bit.ex.mapper.UserMapper;
import edu.bit.ex.vo.UserVO;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@Service
@NoArgsConstructor
public class UserService {
	
	@Inject
	private UserMapper userMapper;
	
	@Inject
	private BCryptPasswordEncoder PassEncoder;
	
	public void addUser(UserVO userVO){
		String password = userVO.getPassword();
		String encode = PassEncoder.encode(password);
		
		userVO.setPassword(encode);
		
		userMapper.insertUser(userVO);
		userMapper.insertAuthorities(userVO);
	}

}
