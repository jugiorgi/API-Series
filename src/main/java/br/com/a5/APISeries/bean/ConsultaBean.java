package br.com.a5.APISeries.bean;

import java.util.Arrays;

public class ConsultaBean {

	private Integer id;
	private String nome;
	private String banner;
	private String id_serie;
	private String status;
	private String firstAired;
	private String network;
	private String tempo_episodio;
	private String[] genero;
	private String descricao;
	private String airsDayOfWeek;
	private String airsTime;
	private String rating;
	private String imdbId;
	private String zap2itId;
	private String data_adicao;
	private String nota;
	private String qtd_votos;
	private String slug;

	public ConsultaBean() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public String getId_serie() {
		return id_serie;
	}

	public void setId_serie(String id_serie) {
		this.id_serie = id_serie;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFirstAired() {
		return firstAired;
	}

	public void setFirstAired(String firstAired) {
		this.firstAired = firstAired;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getTempo_episodio() {
		return tempo_episodio;
	}

	public void setTempo_episodio(String tempo_episodio) {
		this.tempo_episodio = tempo_episodio;
	}

	public String[] getGenero() {
		return genero;
	}

	public void setGenero(String[] genero) {
		this.genero = genero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAirsDayOfWeek() {
		return airsDayOfWeek;
	}

	public void setAirsDayOfWeek(String airsDayOfWeek) {
		this.airsDayOfWeek = airsDayOfWeek;
	}

	public String getAirsTime() {
		return airsTime;
	}

	public void setAirsTime(String airsTime) {
		this.airsTime = airsTime;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getZap2itId() {
		return zap2itId;
	}

	public void setZap2itId(String zap2itId) {
		this.zap2itId = zap2itId;
	}

	public String getData_adicao() {
		return data_adicao;
	}

	public void setData_adicao(String data_adicao) {
		this.data_adicao = data_adicao;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getQtd_votos() {
		return qtd_votos;
	}

	public void setQtd_votos(String qtd_votos) {
		this.qtd_votos = qtd_votos;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	@Override
	public String toString() {
		return "ConsultaBean [id=" + id + ", nome=" + nome + ", banner=" + banner
				+ ", id_serie=" + id_serie + ", status=" + status + ", firstAired=" + firstAired + ", network="
				+ network + ", tempo_episodio=" + tempo_episodio + ", genero=" + Arrays.toString(genero)
				+ ", descricao=" + descricao + ", airsDayOfWeek=" + airsDayOfWeek + ", airsTime=" + airsTime
				+ ", rating=" + rating + ", imdbId=" + imdbId + ", zap2itId=" + zap2itId + ", data_adicao="
				+ data_adicao + ", nota=" + nota + ", qtd_votos=" + qtd_votos + ", slug=" + slug + "]";
	}

}
