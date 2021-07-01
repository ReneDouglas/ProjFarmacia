package inicio;

public class Material {
	private int id;
	private double precoUnitario;
	private String nome, descricao, apresentacao, grupo, subGrupo, dataCadastro, dataValidade;
	
	public Material(int id, String nome, String descricao, String apresentacao, String grupo, String subGrupo, String dataCadastro, String dataValidade, long precoUnitario) {
		this.id=id;
		this.nome=nome;
		this.descricao=descricao;
		this.apresentacao=apresentacao;
		this.grupo=grupo;
		this.subGrupo=subGrupo;
		this.dataCadastro=dataCadastro;
		this.dataValidade=dataValidade;
		this.precoUnitario=precoUnitario;
	}

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return nome;
	}

	public double getPrecoUnitario() {
		return this.precoUnitario;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public String getApresentacao() {
		return this.apresentacao;
	}

	public String getGrupo() {
		return this.grupo;
	}

	public String getSubGrupo() {
		return this.subGrupo;
	}

	public String getDataCadastro() {
		return this.dataCadastro;
	}

	public String getDataValidade() {
		return this.dataValidade;
	}	
}
