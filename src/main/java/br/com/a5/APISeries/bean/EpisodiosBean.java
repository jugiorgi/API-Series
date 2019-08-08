package br.com.a5.APISeries.bean;

import java.util.List;

public class EpisodiosBean {

	private Integer id_episodio;
	private String temporada;
	private Integer id_temporada;
	private Integer numero_episodio;
	private String nome_episodio;
	private String data_exibicao;
	private List<String> diretores;
	private List<String> roteirista;
	private String descricao_episodio;
	private String imagem_episodio;
	private Integer id_serie;
	private Integer nota;
	private Integer numero_votos;

	public Integer getId_episodio() {
		return id_episodio;
	}

	public void setId_episodio(Integer id_episodio) {
		this.id_episodio = id_episodio;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public Integer getId_temporada() {
		return id_temporada;
	}

	public void setId_temporada(Integer id_temporada) {
		this.id_temporada = id_temporada;
	}

	public String getNome_episodio() {
		return nome_episodio;
	}

	public void setNome_episodio(String nome_episodio) {
		this.nome_episodio = nome_episodio;
	}

	public String getData_exibicao() {
		return data_exibicao;
	}

	public void setData_exibicao(String data_exibicao) {
		this.data_exibicao = data_exibicao;
	}

	public List<String> getDiretores() {
		return diretores;
	}

	public void setDiretores(List<String> diretores) {
		this.diretores = diretores;
	}

	public List<String> getRoteirista() {
		return roteirista;
	}

	public void setRoteirista(List<String> roteirista) {
		this.roteirista = roteirista;
	}

	public String getDescricao_episodio() {
		return descricao_episodio;
	}

	public void setDescricao_episodio(String descricao_episodio) {
		this.descricao_episodio = descricao_episodio;
	}

	public String getImagem_episodio() {
		return imagem_episodio;
	}

	public void setImagem_episodio(String imagem_episodio) {
		this.imagem_episodio = "https://www.thetvdb.com/banners/" + imagem_episodio;
	}

	public Integer getId_serie() {
		return id_serie;
	}

	public void setId_serie(Integer id_serie) {
		this.id_serie = id_serie;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public Integer getNumero_votos() {
		return numero_votos;
	}

	public void setNumero_votos(Integer numero_votos) {
		this.numero_votos = numero_votos;
	}

	public Integer getNumero_episodio() {
		return numero_episodio;
	}

	public void setNumero_episodio(Integer numero_episodio) {
		this.numero_episodio = numero_episodio;
	}

	@Override
	public String toString() {
		return "EpisodiosBean [id_episodio=" + id_episodio + ", temporada=" + temporada + ", id_temporada="
				+ id_temporada + ", numero_episodio=" + numero_episodio + ", nome_episodio=" + nome_episodio
				+ ", data_exibicao=" + data_exibicao + ", diretores=" + diretores + ", roteirista=" + roteirista
				+ ", descricao_episodio=" + descricao_episodio + ", imagem_episodio=" + imagem_episodio + ", id_serie="
				+ id_serie + ", nota=" + nota + ", numero_votos=" + numero_votos + "]";
	}

}
