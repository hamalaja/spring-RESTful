package vn.lamha.restful.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vn.lamha.restful.om.User;
import vn.lamha.restful.services.AuthenticationService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private AuthenticationService authService;


	/**
	 * ResponseBody annotation nói cho MVC biết không render một model vào trong view mà phải trả về đối tượng vào trong body.
	 * Spring sẽ tự động convert đối tượng này sang JSON sử dụng Jackson 2
	 */
	@RequestMapping(value = "/verify/{token}", method = RequestMethod.GET)
	public @ResponseBody User verify(@PathVariable(required = true) String token) {
		return authService.verify(token);
	}


	@RequestMapping(value = "/auth", method = RequestMethod.GET)
	public @ResponseBody String auth(@RequestParam(required = true) String token) {
		return authService.verify(token).toString();
	}
}
