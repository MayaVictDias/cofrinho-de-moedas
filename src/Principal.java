import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Cofrinho cofrinho = new Cofrinho(); // instancia de cofrinho
		
		while(true) {
		
			System.out.printf("Qual operação você deseja realizar? %n"
					+ "1 - Adicionar moeda(s) %n"
					+ "2 - Remover moeda(s) %n"
					+ "3 - Listar moedas %n"
					+ "4 - Converter todo o dinheiro para reais %n"
					+ "5 - Sair %n");
			
			int acao = scanner.nextInt();
			
			if(acao == 1) { // adicionar moedas
				
				System.out.printf("%nCom qual moeda você deseja trabalhar? %n"
						+ "1 - Dolar %n"
						+ "2 - Euro %n"
						+ "3 - Real %n");
				int tipoMoeda = scanner.nextInt();
				
				System.out.printf("%nQuantas moedas você deseja adicionar? "
						+ "(obs: separar casas decimais com vírgula)%n");
				double adicionarMoeda = scanner.nextDouble();
				
				cofrinho.adicionarMoedas(tipoMoeda, adicionarMoeda);
				
			} else if(acao == 2) { // remover moedas
				
				System.out.printf("%nCom qual moeda você deseja trabalhar? %n"
						+ "1 - Dolar %n"
						+ "2 - Euro %n"
						+ "3 - Real %n");
				int tipoMoeda = scanner.nextInt();
				
				System.out.printf("%nQuantas moedas você deseja remover? "
						+ "(obs: separar casas decimais com vírgula)%n");
				double removerMoeda = scanner.nextDouble();
				
				cofrinho.removerMoedas(tipoMoeda, removerMoeda);
				
			} else if(acao == 3) { // listar moedas
				
				System.out.println(); // quebra de linha
				cofrinho.listagemMoedas();
				
			} else if(acao == 4) { // converter dinheiro para reais
				
				System.out.println(); // quebra de linha
				cofrinho.totalConvertido();
				
			} else if(acao == 5) { // encerrar programa
				
				break;
			}
			
			System.out.println(); // quebra de linha
	
		}
		
		scanner.close();
		
		System.out.println(); // quebra de linha
		
		System.out.println("Programa encerrado");
	}

}