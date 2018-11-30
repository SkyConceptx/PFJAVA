package catalogo;

public class UsuarioJogo {
	private Object user;
	private Object jogo;
	
	public UsuarioJogo(Object user, Object jogo) {
		this.user = user;
		this.jogo = jogo;
	}

	public Object getUser() {
		return user;
	}

	public void setUser(Object user) {
		this.user = user;
	}

	public Object getJogo() {
		return jogo;
	}

	public void setJogo(Object jogo) {
		this.jogo = jogo;
	}
	
	
}
