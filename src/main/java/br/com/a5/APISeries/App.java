package br.com.a5.APISeries;

import java.util.ArrayList;
import java.util.List;

import br.com.a5.APISeries.bean.BuscaBean;
import br.com.a5.APISeries.controller.BuscarController;
import br.com.a5.APISeries.controller.ConsultaController;

public class App {
	
    public static void main( String[] args ){
    	
    	BuscarController buscac = new BuscarController();
    	List<BuscaBean> lista = new ArrayList<BuscaBean>();
    	lista = buscac.organizaSerie("The 100");
    	
    	
    	ConsultaController consultar = new ConsultaController();
    	System.out.println(consultar.consulta(lista.get(0).getId()));
    }
}
