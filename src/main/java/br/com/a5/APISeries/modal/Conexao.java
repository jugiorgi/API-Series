package br.com.a5.APISeries.modal;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

import br.com.a5.APISeries.utils.Propriedade;
import br.com.a5.APISeries.utils.Propriedade.EnumPropriedade;

public class Conexao {

	public String ConsultaSerie(String q) {
		String resposta = "";
		Propriedade prop = new Propriedade(EnumPropriedade.Auth);
		String token = prop.getValor("token");
		String url = "https://api.thetvdb.com/search/series?name=";

		try {
			String url_com_parametro = encodeValue(q, url);
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpGet get = new HttpGet(url_com_parametro);
			get.setHeader("Authorization", "Bearer " + token);
			get.setHeader("Accept-Language", "pt");
			HttpResponse response = httpClient.execute(get);
			resposta = new BasicResponseHandler().handleResponse(response);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resposta;
	}

	private static String encodeValue(String p, String url) {
		String urlEditada = "";
		
		try {
			
			urlEditada = url + URLEncoder.encode(p, StandardCharsets.UTF_8.toString());
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return urlEditada;
	}
}
