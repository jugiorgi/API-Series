package br.com.a5.APISeries.bean;

public class AtoresBean {

	private Integer id_ator;
	private Integer id_serie;
	private String nome;
	private String personagem;
	private String imagem;

	public Integer getId_ator() {
		return id_ator;
	}

	public void setId_ator(Integer id_ator) {
		this.id_ator = id_ator;
	}

	public Integer getId_serie() {
		return id_serie;
	}

	public void setId_serie(Integer id_serie) {
		this.id_serie = id_serie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPersonagem() {
		return personagem;
	}

	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = "https://www.thetvdb.com/banners/" + imagem;
	}

	@Override
	public String toString() {
		return "AtoresBean [id_ator=" + id_ator + ", id_serie=" + id_serie + ", nome=" + nome + ", personagem="
				+ personagem + ", imagem=" + imagem + "]";
	}

}
