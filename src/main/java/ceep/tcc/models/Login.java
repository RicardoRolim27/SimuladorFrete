package ceep.tcc.models;

import java.io.Serializable;

public class Login implements Serializable {
	private static final long serialVersionUID = 1L;
	

	private String usuario;
	
	
	private String senha;
	
	public Login() {
	}

	public Login(String email, String senha) {
		super();
		this.usuario = email;
		this.senha = senha;
	}

	public String getEmail() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}
	
}
