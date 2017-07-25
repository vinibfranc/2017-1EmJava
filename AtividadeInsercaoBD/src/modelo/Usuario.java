package modelo;

public class Usuario {
	private String user;
	private String senha;
	
	public Usuario(String user, String senha) {
		super();
		this.user = user;
		this.senha = senha;
	}
	
	public Usuario() {
		super();
	}

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
