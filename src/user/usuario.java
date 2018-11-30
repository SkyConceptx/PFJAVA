package user;

public class usuario{
	private String name;
	private String user;
	private String pass;
	
	public usuario(String name, String user, String pass) {
		this.name = name;
		this.user = user;
		this.pass = pass;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome;
	}
		
}

