package vn.hamalaja.restful.services;

import vn.hamalaja.restful.om.User;

/**
 * @author lamhm
 *
 */
public interface IAuthenticationService {
	User verify(String token);
}
