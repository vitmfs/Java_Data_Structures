package ficha03exerc04;

import java.util.Scanner;

public class MainFicha03Exerc04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Lista lista01 = new Lista();
		Lista lista02 = new Lista();
		Lista lista03 = new Lista();
				
		System.out.println("Bem-vindo aoprograma Junta Listas!\n");
		
		
		int opcaoEscolhida = 0;
		
		do {
			
			
			
			try {
				
				imprimeOpcoes();
				opcaoEscolhida = Integer.parseInt(scanner.next());
				
			} catch (Exception e) {
				
				opcaoEscolhida = 999;
				
				
			}
			
			
			
		} while (opcaoEscolhida != 1 &&
				opcaoEscolhida != 2 &&
				opcaoEscolhida != 3 &&
				opcaoEscolhida != 0);
		
		
		
		
		while (opcaoEscolhida != 0) {
			
			
			switch(opcaoEscolhida) {
			
				case 1:
					System.out.println("1) Criar as listas!\n");
					
					int valorInserido01 = -1;
					
					do {
						
						try {
							
							System.out.print("Insira um novo valor na primeira lista: ");
							valorInserido01 = Integer.parseInt(scanner.next());
							lista01.inserirOrdem(valorInserido01);
							
						} catch (Exception e) {
							
							
							
						}
						
						
						
					} while (valorInserido01 != -1);
					
					
					int valorInserido02 = -1;
					
					do {
						
						try {
							
							System.out.print("Insira um novo valor na segunda lista: ");
							valorInserido02 = Integer.parseInt(scanner.next());
							lista01.inserirOrdem(valorInserido02);
							
						} catch (Exception e) {
							
							
							
						}
						
						
						
					} while (valorInserido02 != -1);
					
					
					
					break;
					
				case 2:
					System.out.println("Criar a lista resultado");
					
					if (lista01.getPrim() != null ) {
						
						No adicionar = lista01.getPrim();
						
						while (adicionar != null) {
							
							lista03.inserirOrdem(adicionar.getValor());
							
							adicionar = adicionar.getProximoNo();
							
						}
						
						
					}
					
					if ( lista02.getPrim() != null) {
						
						No adicionar = lista02.getPrim();
						
						while (adicionar != null) {
							
							lista02.inserirOrdem(adicionar.getValor());
							
							adicionar = adicionar.getProximoNo();
						}
					}
					
					lista03.imprimeLista();
					break;
					
				case 3:
					System.out.println("Imprimir os elementos de cada uma das listas");
					lista01.imprimeLista();
					lista02.imprimeLista();
					break;
					
				default:
					System.out.println("Opção desconhecida!");
					break;
						
			
			
			
			}
			
			
			
			
			
			
			
			
			
			
			do {
				
				
				
				try {
					
					imprimeOpcoes();
					opcaoEscolhida = Integer.parseInt(scanner.next());
					
				} catch (Exception e) {
					
					opcaoEscolhida = 999;
					
					
				}
				
				
				
			} while (opcaoEscolhida != 1 &&
					opcaoEscolhida != 2 &&
					opcaoEscolhida != 3 &&
					opcaoEscolhida != 0);
			
			
			
		}
		
		System.out.println("Cheguei ao fim!");
		
		
		
	}
	
	
	public static void imprimeOpcoes() {
		
		System.out.println("1) Criar as listas");
		System.out.println("2) Criar a lista resultado");
		System.out.println("3) Imprimir os elementos de cada uma das listas");
		System.out.println("0) Sair");
		
		System.out.print("Escolha a sua opção: ");

	}
	
	
}

/*
 4. Fusão de listas
Dadas duas listas ordenadas, pretende-se construir uma terceira lista que conterá todos os
elementos, sem repetições dessas duas listas. Os nós da lista são números inteiros.
Escreva um programa em Java para:
a) Criar as listas. Cada lista não contém elementos repetidos.
b) Criar a lista resultado conforme descrito.
c) Imprimir os elementos de cada uma das listas
*/
