package ficha02exerc01;

public class Livro {
	
	private String nomeAutor;
	private String titulo;
	private String isbn;
	private boolean isDisponivel;
	private String idAluno;
	private Aluno[] pedidosEmprestimo;
	
	public Livro(String nomeAutorT, String tituloT, String isbnT) {
		
		nomeAutor = nomeAutorT;
		titulo = tituloT;
		isbn = isbnT;
		idAluno = "";
		pedidosEmprestimo = new Aluno[10];
		
	}
	
	
	public Aluno[] getPedidosEmprestimo() {
		return pedidosEmprestimo;
	}

	public void setPedidosEmprestimo(Aluno[] pedidosEmprestimo) {
		this.pedidosEmprestimo = pedidosEmprestimo;
	}

	public Livro(String nomeAutorT, String tituloT, String isbnT, boolean isDisponivelT, String idAlunoT) {

		nomeAutor = nomeAutorT;
		titulo = tituloT;
		isbn = isbnT;
		isDisponivel = isDisponivelT;
		idAluno = idAlunoT;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutorT) {
		nomeAutor = nomeAutorT;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String tituloT) {
		titulo = tituloT;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbnT) {
		isbn = isbnT;
	}

	public boolean isDisponivel() {
		return isDisponivel;
	}

	public void setDisponivel(boolean isDisponivelT) {
		isDisponivel = isDisponivelT;
	}

	public String getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(String idAlunoT) {
		idAluno = idAlunoT;
	}
	
	
	
	
	
	
	

}


/*
Crie uma classe Livro a qual deverá conter:
 ATRIBUTOS
o nomeAutor (apenas um)
o Titulo
o ISBN 978-3-16-148410-0
o Estado (disponivel ou não)
o IdAluno (identificação do aluno que tem o livro emprestado)
o PedidosEmprestimo (do tipo array)
*/
