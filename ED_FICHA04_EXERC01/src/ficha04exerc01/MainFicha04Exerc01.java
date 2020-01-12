package ficha04exerc01;

import java.util.Scanner;

public class MainFicha04Exerc01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ListaBidirecional lista = new ListaBidirecional();
		lista.inserirDadosTeste();
		
		System.out.println("Bem-vindo ao programa da Ficha 04, Exerc�cio 01");
		
		int opcaoEscolhida = 0;
		
		do {
			
			try {
				
				imprimeOpcoes();
				opcaoEscolhida = Integer.parseInt(scanner.next());

				
			} catch (Exception e) {
				
				opcaoEscolhida = 999;
				
				
			}
			
			
		} while (opcaoEscolhida != 0 &&
				opcaoEscolhida != 1 &&
				opcaoEscolhida != 2 &&
				opcaoEscolhida != 3);
		
		
		while (opcaoEscolhida != 0) {
			
			
			
			switch (opcaoEscolhida) {
			
			case 1:
				
				System.out.print("Insira novo valor: ");
				int valorInserido = scanner.nextInt();
				lista.inserirOrdenadamente(valorInserido);
				break;
				
			case 2:
				System.out.println("Insira o n�mero a apagar");
				lista.apagarNodos(Integer.parseInt(scanner.next()));
				break;
				
			case 3:
				//System.out.println("Escolheu a op��o 3!");
				lista.imprimirNodos();
				break;
				
			default:
				System.out.println("N�o conhe�o essa op��o!");
				break;

			
			}
			
			
			do {
				
				try {
					
					imprimeOpcoes();
					opcaoEscolhida = Integer.parseInt(scanner.next());

					
				} catch (Exception e) {
					
					opcaoEscolhida = 999;
					
					
				}
				
				
			} while (opcaoEscolhida != 0 &&
					opcaoEscolhida != 1 &&
					opcaoEscolhida != 2 &&
					opcaoEscolhida != 3);
			
		}
		
		
		scanner.close();
		System.out.println("Chegou ao fim!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void imprimeOpcoes() {
		
		System.out.println("\n1) Inserir elemento na lista");
		System.out.println("2) Apagar todas as ocorr�ncias de um n�mero da lista");
		System.out.println("3) Listar todos os elementos da lista");
		System.out.println("0) Sair\n");
		
		System.out.print("Op��o escolhida: ");

	}

}
