package ficha05exerc01;

import java.util.Scanner;

public class MainFicha05Exerc01 {
	
	public static void main(String[] args) {
		
		
		System.out.println("Bem-vindo à pilha de Strings!");
		
		Scanner scanner = new Scanner(System.in);
		ADTPilha pilha = new ADTPilha();
		pilha.inserirDadosTeste();
		
		int opcaoInserida;
		
		do {
			
			try {
				
				imprimeOpcoes();
				opcaoInserida = Integer.parseInt(scanner.next());
				
				
			} catch (Exception e) {
				
				opcaoInserida = 999;
				
				
			}
			
			
		} while (opcaoInserida != 1 &&
				opcaoInserida != 2 &&
				opcaoInserida != 3 &&
				opcaoInserida != 4 &&
				opcaoInserida != 0);
		
		
		while (opcaoInserida != 0) {
			
			switch (opcaoInserida) {
			
			case 1:
				System.out.println("Insira uma String: ");
				pilha.push(scanner.next());
				break;
				
			case 2:
				
				System.out.out.println(pilha.pop());
				
				break;
				
			case 3:
				System.out.println(pilha.peek());
				break;
				
			case 4:
				//System.out.println("Opção 4");
				pilha.imprimirPilha();
				break;
				
			default:
				System.out.println("Não conheço essa opção!");
				break;
			
			
			
			
			
			
			
			
			
			}
			
			
			do {
				
				try {
					
					imprimeOpcoes();
					opcaoInserida = Integer.parseInt(scanner.next());
					
					
				} catch (Exception e) {
					
					opcaoInserida = 999;
					
					
				}
				
				
			} while (opcaoInserida != 1 &&
					opcaoInserida != 2 &&
					opcaoInserida != 3 &&
					opcaoInserida != 4 &&
					opcaoInserida != 0);
			
			
			
			
			
		}
		
		
		
		
		System.out.println("Chegou ao fim!");
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void imprimeOpcoes() {
		
		System.out.println("\n1) Inserir String");
		System.out.println("2) Remover String");
		System.out.println("3) Ver String no topo");
		System.out.println("4) Imprimir pilha");
		System.out.println("0) Sair");
		
		System.out.print("\nOpção escolhida: ");
		
	}

}
