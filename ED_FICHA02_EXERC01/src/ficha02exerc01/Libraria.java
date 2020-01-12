package ficha02exerc01;

import java.util.Scanner;

public class Libraria {
	
	private static Livro[] livros = new Livro[40000];
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		pln("Bem vindo ao programa Libraria!\n");
		
		imprimeOpcoes();
		
		int opcaoEscolhida = Integer.parseInt(scanner.next());
		
		while(opcaoEscolhida != 0) {
			
			switch(opcaoEscolhida) {
			
			case 1:
				pln("Opção 1");
				break;
			
			case 2:
				pln("Opção 2");
				break;
				
			case 3:
				pln("Opção 3");
				break;
				
			case 4:
				pln("Opção 4");
				break;
				
			case 5:
				pln("Opção 5");
				break;
				
			case 6:
				pln("Opção 6");
				break;
				
			case 7:
				pln("Opção 7");
				break;
				
			case 8:
				pln("Opção 8");
				break;
				
			case 9:
				pln("Opção 9");
				break;
				
				default:
					System.out.println("Opção desconhecida!");
					break;
			
			
			
			}
			
			
			imprimeOpcoes();
			opcaoEscolhida = Integer.parseInt(scanner.next());

		}
		
		scanner.close();
		pln("Tenha um bom dia com Mokambo!");
		
		
		
		
		
		
		
		
	}
	
	public static void imprimeOpcoes() {
		
		pln("1) Registrar Livro");
		pln("2) Registrar Livro");
		pln("3) Pesquisar Livro");
		pln("4) Listar Livros (ordem alfabética)");
		pln("5) Listar Livros de Autor");
		pln("6) Registar empréstimos");
		pln("7) Listar pedidos de empréstimo de livro");
		pln("8) Imprimir Dados de Aluno com Livro");
		pln("9) Imprimir Alunos em fila de espera para Livro");
		pln("0) Sair");
		
		System.out.print("Insira a opção pretendida");
		
		
	}
	
	public static void pln(String stringToPrintT) {
		
		System.out.println(stringToPrintT);
		
		
	}

}

/*
 * Crie um programa para
1. Registar livros
2. Pesquisar um dado livro
3. Listar os detalhes de todos os livros, por ordem alfabética de título
4. Listar todos os livros de um dado autor
5. Registar emprestimos de um livro
6. Registar pedido de emperstimo de livro que não se encontra disponivel
7. Imprimir os dados do aluno que tem um dado livro
8. Imprimir os dados dos alunos à espera da disponibilidade de livros para emprestimo (para
cada livro imprimir o título)
Nota: o 1º aluno a pedir o livro é o primeiro a ter direito ao emprestimo
*/
