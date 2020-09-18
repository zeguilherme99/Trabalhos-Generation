package AprendendoPoo;

public class Pessoa {
	private String nome;
	private String enderešo;
	private String telefone;
	private String cidade;
	private String pais;
	
	public Pessoa (String nome,String enderešo, String telefone, String cidade, String pais )
	{
		this.nome=nome;
		this.enderešo=enderešo;
		this.telefone=telefone;
		this.cidade=cidade;
		this.pais=pais;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
