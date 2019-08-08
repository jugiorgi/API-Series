package br.com.a5.APISeries.modal;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

import br.com.a5.APISeries.utils.Propriedade;
import br.com.a5.APISeries.utils.Propriedade.EnumPropriedade;

public class Consultar {

	public String consultarSerie(Integer id) {
		Propriedade propAuth = new Propriedade(EnumPropriedade.Auth);
		Propriedade propUrl = new Propriedade(EnumPropriedade.Url);

		String token = propAuth.getValor("token");
		String url = propUrl.getValor("consulta") + id;
		String resposta = "";

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
		
		System.out.println("Consulta URL: " + url);
		return resposta;
	}

}
