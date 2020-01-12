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
				pln("Op��o 1");
				break;
			
			case 2:
				pln("Op��o 2");
				break;
				
			case 3:
				pln("Op��o 3");
				break;
				
			case 4:
				pln("Op��o 4");
				break;
				
			case 5:
				pln("Op��o 5");
				break;
				
			case 6:
				pln("Op��o 6");
				break;
				
			case 7:
				pln("Op��o 7");
				break;
				
			case 8:
				pln("Op��o 8");
				break;
				
			case 9:
				pln("Op��o 9");
				break;
				
				default:
					System.out.println("Op��o desconhecida!");
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
		pln("4) Listar Livros (ordem alfab�tica)");
		pln("5) Listar Livros de Autor");
		pln("6) Registar empr�stimos");
		pln("7) Listar pedidos de empr�stimo de livro");
		pln("8) Imprimir Dados de Aluno com Livro");
		pln("9) Imprimir Alunos em fila de espera para Livro");
		pln("0) Sair");
		
		System.out.print("Insira a op��o pretendida");
		
		
	}
	
	public static void pln(String stringToPrintT) {
		
		System.out.println(stringToPrintT);
		
		
	}

}

/*
 * Crie um programa para
1. Registar livros
2. Pesquisar um dado livro
3. Listar os detalhes de todos os livros, por ordem alfab�tica de t�tulo
4. Listar todos os livros de um dado autor
5. Registar emprestimos de um livro
6. Registar pedido de emperstimo de livro que n�o se encontra disponivel
7. Imprimir os dados do aluno que tem um dado livro
8. Imprimir os dados dos alunos � espera da disponibilidade de livros para emprestimo (para
cada livro imprimir o t�tulo)
Nota: o 1� aluno a pedir o livro � o primeiro a ter direito ao emprestimo
*/
