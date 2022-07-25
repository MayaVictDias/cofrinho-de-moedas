
public class Dolar extends Moeda {

	private double valor = 0;
	
	@Override
	double valor() {
		return valor;
	}
	
	void adicionarDolar(double moeda) {
		valor =+ moeda;
	}

	void removerDolar(double moeda) {
		valor =- moeda;	
	}
	
	@Override
	void info() {
		System.out.println("Dolares = $" + valor);
	}

	// metodo para converter os dolares registrados em reais
	@Override
	double converter() {
		// dolar na cotação atual = $1 => R$5,50
		double converterDolaresParaReais = valor * 5.5;
		
		return converterDolaresParaReais;
		
	}
}