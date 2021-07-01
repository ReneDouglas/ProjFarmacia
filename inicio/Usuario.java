package inicio;

public class Usuario {
	private String nome, nomeLogin, senha, nivel;
	private int id;
	
	public Usuario(int id, String nome, String nomeLogin, String senha, String nivel) {
		this.id=id;
		this.nome=nome;
		this.nomeLogin=nomeLogin;
		this.senha=senha;
		this.nivel=nivel;
		
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeLogin() {
		return this.nomeLogin;
	}

	public void setNomeLogin(String nomeLogin) {
		this.nomeLogin = nomeLogin;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
