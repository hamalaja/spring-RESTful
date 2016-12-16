package vn.hamalaja.restful.services;

import org.springframework.stereotype.Service;

import vn.hamalaja.restful.om.User;

/**
 * @author lamhm
 *
 */
@Service
public class AuthenticationService implements IAuthenticationService {

	@Override
	public User verify(String token) {
		User user = new User();
		user.setId(10003);
		user.setAvatar("/avatar/1323/lamha.jpg");
		user.setUsername("lamha");
		return user;
	}

}
