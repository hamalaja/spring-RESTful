package vn.lamha.restful.om;

/**
 * @author lamhm
 *
 */
public class User {
	private int id;
	private String username;
	private String avatar;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getAvatar() {
		return avatar;
	}


	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}


	@Override
	public String toString() {
		return "{\"id:\"" + id + ",\"username\":\"" + username + "\",\"avatar\":\"" + avatar + "\"}";
	}

}
