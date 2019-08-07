package br.com.a5.APISeries.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propriedade {

	public enum EnumPropriedade {
		Auth, Url;
	}

	private static final String AUTH = "auth.properties";
	private static final String URL = "url.properties";

	private Properties props;
	private String arquivo;

	public Propriedade(EnumPropriedade tipo) {

		String path = "C:\\Users\\jmartin\\Documents\\Workspace - Eclipse\\Workspace - Jee\\APISeries\\";

		switch (tipo) {
		case Auth:
			arquivo = AUTH;
			try {
				FileInputStream fis = new FileInputStream(path + arquivo);
				props = new Properties();
				props.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case Url:
			arquivo = URL;
			try {
				FileInputStream fis = new FileInputStream(path + arquivo);
				props = new Properties();
				props.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		default:
			System.out.println("Tipo de properties invalida");
			break;
		}

	}

	public String getArquivo() {
		return arquivo;
	}

	public String getValor(String propriedade) {
		return props.getProperty(propriedade);

	}

}
