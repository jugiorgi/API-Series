package br.com.a5.APISeries.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.a5.APISeries.bean.SerieBean;
import br.com.a5.APISeries.modal.Conexao;

public class ConsultaSerieController {
	
	public List<SerieBean> organizaSerie(String q){
		SerieBean bean;
		Conexao conexao = new Conexao();
		List<SerieBean> lista = new ArrayList<SerieBean>();
		JSONObject json;
		JSONArray jsonData;
		JSONObject jsonSerie;
		
		try {
			String retorno_ws = conexao.ConsultaSerie(q);
			
			json = new JSONObject(retorno_ws);
			jsonData = new JSONArray(json.getString("data"));
			
			for(int i = 0; i < jsonData.length(); i++) {
				bean = new SerieBean();
				jsonSerie = new JSONObject(jsonData.get(i).toString());
				
				bean.setAliases(jsonSerie.getString("aliases"));
				bean.setBanner(jsonSerie.getString("banner"));
				bean.setFirstAired(jsonSerie.getString("firstAired"));
				bean.setId(jsonSerie.getInt("id"));
				bean.setNetwork(jsonSerie.getString("network"));
				bean.setOverview(jsonSerie.getString("overview"));
				bean.setSeriesName(jsonSerie.getString("seriesName"));
				bean.setSlug(jsonSerie.getString("slug"));
				bean.setStatus(jsonSerie.getString("status"));
				
				lista.add(bean);
			}
			
			System.out.println(lista.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}

}
