package AprendendoPoo;

public class Pessoa {
	private String nome;
	private String endereço;
	private String telefone;
	private String cidade;
	private String pais;
	
	public Pessoa (String nome,String endereço, String telefone, String cidade, String pais )
	{
		this.nome=nome;
		this.endereço=endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
