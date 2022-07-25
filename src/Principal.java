import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Cofrinho cofrinho = new Cofrinho();
		
		while(true) {
		
			System.out.printf("Qual operação você deseja realizar? %n"
					+ "1 - Adicionar moeda(s) %n"
					+ "2 - Remover moeda(s) %n"
					+ "3 - Listar moedas %n"
					+ "4 - Converter todo o dinheiro para reais %n"
					+ "5 - Sair %n");
			
			int acao = scanner.nextInt();
			
			
			if(acao == 1) { // adicionar moedas
				
				System.out.println("Quantas moedas você deseja adicionar?");
				double adicionarMoeda = scanner.nextDouble();
				
				cofrinho.adicionarMoedas(adicionarMoeda);
				
			} else if(acao == 2) { // remover moedas
				
				System.out.println("Quantas moedas você deseja remover?");
				double removerMoeda = scanner.nextDouble();
				
				cofrinho.removerMoedas(removerMoeda);
				
			} else if(acao == 3) { // listar moedas
				
				cofrinho.listagemMoedas();
				
			} else if(acao == 4) { // converter dinheiro para reais
				
				cofrinho.totalConvertido();
				
			} else if(acao == 5) {
				
				break;
			}
			
			System.out.println(); //quebra de linha
	
		}
		scanner.close();
		
		System.out.println("Programa encerrado");
	}

}