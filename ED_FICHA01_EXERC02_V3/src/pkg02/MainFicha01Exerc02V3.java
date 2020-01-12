package pkg02;

import java.util.Scanner;

public class MainFicha01Exerc02V3 {

	public static void main(String[] args) {

		int opcaoInserida;
		ListaDeContactos listaDeContactos = new ListaDeContactos(9);
		//loadDummyData(listaDeContactos);

		Scanner leitor = new Scanner(System.in);

		System.out.println("Bem-vindo ao programa de gestão de contactos!\n");

		opcaoInserida = imprimeOpcoes();

		while (opcaoInserida != 0) {

			switch (opcaoInserida) {

			case 1:
				
				System.out.print("\nPor favor coloque o nome a inserir: ");
				String nomeInserido = leitor.next();
				leitor.nextLine();
				System.out.print("\nPor favor coloque o email a inserir: ");
				String emailInserido = leitor.next();
				leitor.nextLine();
				System.out.print("\nPor favor coloque o tipo do contacto a inserir: ");
				String tipoInserido = leitor.next();
				leitor.nextLine();

				Contacto novoContacto = new Contacto(nomeInserido, emailInserido, tipoInserido);
				listaDeContactos.inserirContacto(novoContacto);

				break;

			case 2:

				
				System.out.print("\nPor favor coloque o nome do contacto a remover: ");
				String nomeRemovido = leitor.next();
				System.out.print("\nPor favor coloque o email do contacto a remover: ");
				String emailRemovido = leitor.next();
				if( listaDeContactos.removerContacto(nomeRemovido, emailRemovido) ) {
					
					System.out.println("Contacto Removido!");
				} else {
					
					System.out.println("Contacto Não Encontrado!");
				}
				
				break;

			case 3:

				listaDeContactos.imprimirContactosDaLista();

				break;

			case 4:

				System.out.print("\nPor favor coloque o email do contacto a pesquisar: ");
				String emailPesquisado = leitor.next();
				System.out.print("\nPor favor coloque o nome do contacto a pesquisar: ");
				String nomePesquisado = leitor.next();
				listaDeContactos.pesquisarContacto(nomePesquisado, emailPesquisado);

				break;

			case 5:

				System.out.println("\nA lista está vazia? " + listaDeContactos.isVazia());

				break;

			case 6:

				System.out.println("\nA lista está cheia? " + listaDeContactos.isCheia());

				break;

			case 7:

				String um = " contacto";
				String doisOuMais = " contactos";

				if (listaDeContactos.totalDeContactos() == 1) {

					System.out.println("\nA lista tem " + listaDeContactos.totalDeContactos() + um);

				} else {

					System.out.println("\nA lista tem " + listaDeContactos.totalDeContactos() + doisOuMais);

				}

				break;

			default:

				System.out.println("\nNão percebo!");

				break;

			}

			opcaoInserida = imprimeOpcoes();

		}

		leitor.close();

		System.out.println("\nObrigado! Tenha um bom dia com Mokambo!");

	}

	public static int imprimeOpcoes() {

		Scanner scanner = new Scanner(System.in);

		int opcao;

		do {

			System.out.println("\n");
			System.out.println("1) Inserir contacto");
			System.out.println("2) Eliminar contacto");
			System.out.println("3) Imprimir contactos");
			System.out.println("4) Pesquisar contacto");
			System.out.println("5) Verificar se lista está vazia");
			System.out.println("6) Verificar se lista está cheia");
			System.out.println("7) Verificar numero de contactos");

			System.out.print("Insira a sua opção: ");

			opcao = scanner.nextInt();

		} while (opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6
				&& opcao != 7);

		return opcao;

	}
	
	public static void loadDummyData(ListaDeContactos listaDeContactosT) {
		
		
		listaDeContactosT.inserirContacto(new Contacto("Vitor", "vitor@gmail.com", "Lazer"));
		listaDeContactosT.inserirContacto(new Contacto("Ana", "ana@gmail.com", "Outros"));
		listaDeContactosT.inserirContacto(new Contacto("Manuel", "manuel@gmail.com", "Trabalho"));
		listaDeContactosT.inserirContacto(new Contacto("Diogo", "diogo@gmail.com", "Trabalho"));
		listaDeContactosT.inserirContacto(new Contacto("Tony", "tony@gmail.com", "Lazer"));
		listaDeContactosT.inserirContacto(new Contacto("Jose", "jose@gmail.com", "Lazer"));
		listaDeContactosT.inserirContacto(new Contacto("Helio", "helio@gmail.com", "Lazer"));
		listaDeContactosT.inserirContacto(new Contacto("Jonas", "jonas@gmail.com", "Lazer"));
		//listaDeContactosT.inserirContacto(new Contacto("Xoninhas", "xonas@gmail.com", "Outros"));

		 
		 
		
	
	}
	
	public static void loadDummy() {
		
		
		 System.out.println("Hello");
		
	
	}

}
