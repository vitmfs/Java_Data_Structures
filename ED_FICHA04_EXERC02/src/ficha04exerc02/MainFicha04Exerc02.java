package ficha04exerc02;

import java.util.Scanner;

public class MainFicha04Exerc02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PilhaLetras pilha = new PilhaLetras();
		pilha.inserirDadosTeste();
		
		System.out.println("Bem-vindo ao programa Pilha de letras!");
		
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
			
			
			switch (opcaoEscolhida) {
			
				case 1:
					String inseridaStr = "";
					System.out.println("Insira a String a transformar: ");
					inseridaStr = scanner.next();
					
					inseridaStr = inseridaStr.trim();
					
					if (inseridaStr.contains(" ")) {
						
						String[] palavras = inseridaStr.split(" ");
						
						inseridaStr = "";
						
						for (int in = 0; in < palavras.length; in++) {
							
							inseridaStr += palavras[in];
						}
					}
					
					System.out.println(inseridaStr);
					
					for (int i = inseridaStr.length() - 1; i >= 0; i-- ) {
						
						pilha.push(inseridaStr.charAt(i));
						
					}
					
					scanner.nextLine();
					
					break;
					
				case 2:
					System.out.println("Insira x: ");
					short x = scanner.nextShort();
					scanner.nextLine();
					System.out.println("Insira y: ");
					short y = scanner.nextShort();
					scanner.nextLine();
					System.out.println("Insira z: ");
					short z = scanner.nextShort();
					scanner.nextLine();
					
					pilha.copyPaste(x, y, z);
					break;
					
				case 3:
					pilha.imprimirLetras();
					break;
					
				default:
					System.out.println("Não conheço essa opção!");
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
		
		
		
		System.out.println("Chegou ao fim!");
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void imprimeOpcoes() {
		
		System.out.println("\n1) Transformar String em Pilha de Characteres");
		System.out.println("2) Método Copy-Paste");
		System.out.println("3) Imprimir Pilha");
		System.out.println("0) Sair\n");
		
		System.out.print("Opção escolhida: ");
		
		
		
		
		
	}

}
