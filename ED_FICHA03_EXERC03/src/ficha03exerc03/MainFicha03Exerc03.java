package ficha03exerc03;

import java.util.Scanner;

public class MainFicha03Exerc03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Lista lista = new Lista();
		
		lista.loadDummyData();

		System.out.println("Bem vindo ao programa Mover para a Frente!");

		int opcao = 0;

		do {

			imprimeOpcoes();

			try {

				opcao = Integer.parseInt(scanner.next());

			} catch (Exception e) {

				opcao = 999;

			}

		} while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0);
		

		while (opcao != 0) {
			
			
			
			
			switch(opcao) {
			
			case 1:
				scanner.nextLine();
				System.out.println("Insira o valor a Inserir: ");
				
				int valorAinserir = scanner.nextInt();
				lista.insereNoFim(valorAinserir);
				lista.imprimirLista();
				
				break;
				
			case 2:
				scanner.nextLine();
				System.out.println("Insira o valor a Pesquisar: ");
				
				int valorAPesquisar = scanner.nextInt();
				lista.pesquisar(valorAPesquisar);
				lista.imprimirLista();
				break;
				
			case 3:
				System.out.println("Imprimir Lista: ");
				lista.imprimirLista();
				break;
				
			default:
				System.out.println("Default");
				break;
				

			
			}

			do {

				imprimeOpcoes();

				try {

					opcao = Integer.parseInt(scanner.next());

				} catch (Exception e) {

					opcao = 999;

				}

			} while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0);

		}
		
		scanner.close();
		System.out.println("Tenha um bom dia com Mokambo!");

	}

	public static void imprimeOpcoes() {
		
		System.out.println("\n");
		System.out.println("1) Inserir String");
		System.out.println("2) Pesquisar String");
		System.out.println("3) Imprimir Lista");
		System.out.println("0) Sair");

		System.out.print("Insira a sua opção: ");
		

	}


}

/*
 * 3. Método “mover para frente” Por vezes a ordem pela qual os elementos estão
 * armazenados numa lista não é importante. Pode-se, frequentemente, acelerar a
 * pesquisa com um método designado “mover para frente”: sempre que um item é
 * acedido, ele é movido para o início da lista. Esta acção resulta normalmente
 * numa melhoria, pois os itens mais requisitados tendem a deslocar-se para o
 * início da lista, enquanto que os menos requisitados vão ficando no fim da
 * lista. Escreva um programa que permita implementar e testar este método
 * “mover para frente”.
 */
