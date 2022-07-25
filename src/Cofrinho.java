//import java.util.ArrayList;s
//import java.util.List;

public class Cofrinho {

	Dolar dolar = new Dolar();
	
	// lista contendo todos os dolares, euros e reais convertidos para reais
	// private ArrayList<List> listaMoedas = new ArrayList<List>();
	
	public void adicionarMoedas(double moeda) {
		dolar.adicionarDolar(moeda);
	}
	
	public void removerMoedas(double moeda) {
		dolar.removerDolar(moeda);
	}
	
	public void listagemMoedas() {
		dolar.info();
	}
	
	public void totalConvertido() {
		double totalConvertido = dolar.converter();
		
		System.out.println("Total convertido: R$" + totalConvertido);
	}
}