package ficha03_exerc02;

import java.util.Scanner;

public class MainFicha03Exerc02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ListaDeEstudantes lista = new ListaDeEstudantes();
		lista.loadDummyData();
		
		System.out.println("Bem vindo ao programa da Associação de Estudantes!");
		
		int opcaoInserida = 0;
		
		do {
			
			imprimeOpcoes();
			opcaoInserida = scanner.nextInt();
			
		} while(opcaoInserida != 1 &&
				opcaoInserida != 2 &&
				opcaoInserida != 3 &&
				opcaoInserida != 4 &&
				opcaoInserida != 0 );
		
		while(opcaoInserida != 0) {
			
			switch(opcaoInserida) {
			
			case 1:
				System.out.println("\nInsira o nome do Estudante: ");
				String nomeInserido = scanner.next();
				System.out.println("\nInsira o nome do Departamento: ");
				String departamentoInserido = scanner.next();
				System.out.println("\nInsira o nome do Cargo: ");
				String cargoInserido = scanner.next();
				
				lista.inserirAlfabeticamente(nomeInserido, departamentoInserido, cargoInserido);
				
				
				break;
				
			case 2:
				System.out.println("\nLista de Estudantes: ");
				lista.imprimirEstudantes();
				break;
				
			case 3:
				System.out.println("\nInsira o Estudante a Eliminar: ");
				String estudanteEliminado = scanner.next();
				lista.eliminarEstudante(estudanteEliminado);
				break;
				
			case 4:
				System.out.println("\nInsira o Departamento a Imprimir");
				String departamentoAImprimir = scanner.next();
				lista.imprimirEstudantesDepartamento(departamentoAImprimir);
				break;
				

				
			default:
				System.out.println("\nNão conheco essa opção!");
				break;

			}
			
			
			
			
			
			do {
				
				imprimeOpcoes();
				opcaoInserida = scanner.nextInt();
				
			} while(opcaoInserida != 1 &&
					opcaoInserida != 2 &&
					opcaoInserida != 3 &&
					opcaoInserida != 4 &&
					opcaoInserida != 0 );
		}
		
		
		System.out.println("\nChegou ao fim!");
		scanner.close();
		
	}
	
	public static void imprimeOpcoes() {
		
		System.out.println("\n");
		System.out.println("1) Inserir novo elemento!");
		System.out.println("2) Imprimir Estudantes");
		System.out.println("3) Eliminar Estudante");
		System.out.println("4) Imprimir Estudantes de um Departamento");
		System.out.println("0) Sair");
		
		System.out.print("\nInsira a opção escolhida: ");
		
		
	}
	

}

