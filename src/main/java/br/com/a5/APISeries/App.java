package br.com.a5.APISeries;

import br.com.a5.APISeries.controller.ConsultaSerieController;

public class App {
	
    public static void main( String[] args ){
    	
    	ConsultaSerieController c = new ConsultaSerieController();
    	c.organizaSerie("The 100");

    }
}
