package br.com.a5.APISeries.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.a5.APISeries.bean.EpisodiosBean;
import br.com.a5.APISeries.modal.Episodio;

public class EpisodioController {

	public List<EpisodiosBean> organizarEpisodio(Integer q){
		List<EpisodiosBean> lista = new ArrayList<EpisodiosBean>();
		List<String> diretores; 
		List<String> roteiristas; 
		Episodio conexao = new Episodio();
		EpisodiosBean bean;
		JSONObject json;
		JSONArray jsonData;
		JSONObject jsonEpisodio;
		JSONArray dirArray;
		JSONArray rotArray;
		
		try {
			String retorno_ws = conexao.consultarEpisodios(q);
			
			json = new JSONObject(retorno_ws);
			jsonData = new JSONArray(json.getString("data"));
			
			for(int i = 0; i < jsonData.length(); i++) {
				bean = new EpisodiosBean();
				diretores = new ArrayList<String>();
				roteiristas = new ArrayList<String>();				
				
				jsonEpisodio = new JSONObject(jsonData.get(i).toString());

				bean.setId_episodio(jsonEpisodio.getInt("id"));
				bean.setTemporada(jsonEpisodio.getString("airedSeason"));
				bean.setId_temporada(jsonEpisodio.getInt("airedSeasonID"));
				bean.setNumero_episodio(jsonEpisodio.getInt("airedEpisodeNumber"));
				bean.setNome_episodio(jsonEpisodio.getString("episodeName"));
				bean.setData_exibicao(jsonEpisodio.getString("firstAired"));
				
				dirArray = new JSONArray(jsonEpisodio.getString("directors").toString());
				for (int d = 0; d < dirArray.length(); d++) {
					diretores.add(dirArray.get(d).toString());
				}
				bean.setDiretores(diretores);
				
				rotArray = new JSONArray(jsonEpisodio.getString("writers").toString());
				for (int r = 0; r < rotArray.length(); r++) {
					roteiristas.add(rotArray.get(r).toString());
				}
				bean.setRoteirista(roteiristas);
				
				bean.setDescricao_episodio(jsonEpisodio.getString("overview"));
				bean.setImagem_episodio(jsonEpisodio.getString("filename"));
				bean.setId_serie(jsonEpisodio.getInt("seriesId"));
				bean.setNota(jsonEpisodio.getInt("siteRating"));
				bean.setNumero_votos(jsonEpisodio.getInt("siteRatingCount"));
				
				lista.add(bean);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
}
