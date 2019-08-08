package br.com.a5.APISeries.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.a5.APISeries.bean.AtoresBean;
import br.com.a5.APISeries.modal.Atores;

public class AtoresController {

	public List<AtoresBean> organizaAtores(Integer q) {
		List<AtoresBean> lista = new ArrayList<AtoresBean>();
		Atores conexao = new Atores();
		AtoresBean bean;
		JSONObject json;
		JSONArray jsonData;
		JSONObject jsonAtor;

		try {
			String retorno_ws = conexao.consultarAtores(q);

			json = new JSONObject(retorno_ws);
			jsonData = new JSONArray(json.getString("data"));

			for (int i = 0; i < jsonData.length(); i++) {
				bean = new AtoresBean();
				jsonAtor = new JSONObject(jsonData.get(i).toString());

				bean.setId_ator(jsonAtor.getInt("id"));
				bean.setId_serie(jsonAtor.getInt("seriesId"));
				bean.setNome(jsonAtor.getString("name"));
				bean.setPersonagem(jsonAtor.getString("role"));
				bean.setImagem(jsonAtor.getString("image"));

				lista.add(bean);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

}
