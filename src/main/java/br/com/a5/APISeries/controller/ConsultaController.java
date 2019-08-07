package br.com.a5.APISeries.controller;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.a5.APISeries.bean.ConsultaBean;
import br.com.a5.APISeries.modal.Consultar;

public class ConsultaController {
	
	public ConsultaBean consulta(Integer id){
		String[] generos = {};
		Consultar conexao = new Consultar();
		ConsultaBean bean = new ConsultaBean();
		JSONObject json;
		JSONArray genero;
		
		try {
			String retorno_ws = conexao.consultarSerie(id);
			
			json = new JSONObject(retorno_ws);
			json = new JSONObject(json.get("data").toString());
			
			bean.setId(json.getInt("id"));
			bean.setNome(json.getString("seriesName"));
			bean.setBanner(json.getString("banner"));
			bean.setId_serie(json.getString("seriesId"));
			bean.setStatus(json.getString("status"));
			bean.setFirstAired(json.getString("firstAired"));
			bean.setNetwork(json.getString("network"));
			bean.setTempo_episodio(json.getString("runtime"));
			genero = new JSONArray(json.getString("genre"));
			
//			for(int i = 0; i < genero.length(); i++) {
//				generos[i] = (String) genero.get(i);
//			}
			
			bean.setDescricao(json.getString("overview"));
			bean.setAirsDayOfWeek(json.getString("airsDayOfWeek"));
			bean.setAirsTime(json.getString("airsTime"));
			bean.setRating(json.getString("rating"));
			bean.setImdbId(json.getString("imdbId"));
			bean.setZap2itId(json.getString("zap2itId"));
			bean.setData_adicao(json.getString("added"));
			bean.setNota(json.getString("siteRating"));
			bean.setQtd_votos(json.getString("siteRatingCount"));
			bean.setSlug(json.getString("slug"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bean;
	}
}
