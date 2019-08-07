package br.com.a5.APISeries.bean;

public class BuscaBean {

	private String aliases;
	private String banner;
	private String firstAired;
	private Integer id;
	private String network;
	private String overview;
	private String seriesName;
	private String slug;
	private String status;

	public BuscaBean() {
	}

	public String getAliases() {
		return aliases;
	}

	public void setAliases(String aliases) {
		this.aliases = aliases;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public String getFirstAired() {
		return firstAired;
	}

	public void setFirstAired(String firstAired) {
		this.firstAired = firstAired;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SerieBean [aliases=" + aliases + ", banner=" + banner + ", firstAired=" + firstAired + ", id=" + id
				+ ", network=" + network + ", overview=" + overview + ", seriesName=" + seriesName + ", slug=" + slug
				+ ", status=" + status + "]";
	}

}
