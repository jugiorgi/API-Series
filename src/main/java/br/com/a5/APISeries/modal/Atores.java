package br.com.a5.APISeries.modal;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

import br.com.a5.APISeries.utils.Propriedade;
import br.com.a5.APISeries.utils.Propriedade.EnumPropriedade;

public class Atores {

	public String consultarAtores(Integer id) {
		Propriedade propAuth = new Propriedade(EnumPropriedade.Auth);
		Propriedade propUrl = new Propriedade(EnumPropriedade.Url);

		String resposta = "";
		String token = propAuth.getValor("token");
		String url = propUrl.getValor("ator").replace("id_serie", id.toString());

		try {

			HttpClient http = HttpClientBuilder.create().build();
			HttpGet get = new HttpGet(url);
			get.setHeader("Authorization", "Bearer " + token);
			get.setHeader("Accept-Language", "pt");
			HttpResponse response = http.execute(get);
			resposta = new BasicResponseHandler().handleResponse(response);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Atores URL:" + url);
		return resposta;
	}

}
