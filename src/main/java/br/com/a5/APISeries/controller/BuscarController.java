package br.com.a5.APISeries.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.a5.APISeries.bean.BuscaBean;
import br.com.a5.APISeries.modal.Buscar;

public class BuscarController {
	
	public List<BuscaBean> organizaSerie(String q){
		List<BuscaBean> lista = new ArrayList<BuscaBean>();
		Buscar conexao = new Buscar();
		BuscaBean bean;
		JSONObject json;
		JSONArray jsonData;
		JSONObject jsonSerie;
		
		try {
			String retorno_ws = conexao.buscarSerie(q);
			
			json = new JSONObject(retorno_ws);
			jsonData = new JSONArray(json.getString("data"));
			
			for(int i = 0; i < jsonData.length(); i++) {
				bean = new BuscaBean();
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
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}

}
