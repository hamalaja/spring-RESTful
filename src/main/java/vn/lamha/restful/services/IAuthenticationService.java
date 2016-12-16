package vn.lamha.restful.services;

import vn.lamha.restful.om.User;

/**
 * @author lamhm
 *
 */
public interface IAuthenticationService {
	User verify(String token);
}
