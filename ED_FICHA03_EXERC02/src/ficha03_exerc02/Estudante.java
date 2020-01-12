package ficha03_exerc02;

public class Estudante {
	
	private String nome;
	private String departamento;
	private String cargo;
	private Estudante proxEstudante;
	
	public Estudante(String nomeT, String departamentoT, String cargoT) {
		
		nome = nomeT;
		departamento = departamentoT;
		cargo = cargoT;
		proxEstudante = null;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nomeT) {
		nome = nomeT;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamentoT) {
		 departamento = departamentoT;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargoT) {
		cargo = cargoT;
	}

	public Estudante getProxEstudante() {
		return proxEstudante;
	}

	public void setProxEstudante(Estudante proxEstudanteT) {
		proxEstudante = proxEstudanteT;
	}
	
	public String toString() {
		
		return "Nome do Estudante: " + getNome() + " Departamento: " + getDepartamento() + " Cargo: " + getCargo();
	}
	

	
	
	
	
	

}

/*
 * 2. Crie um programa que permita gerir a informação dos elementos da Associação de
Estudantes.
O programa deve permitir:
 Inserir informação de cada elemento, por ordem alfabética de nome;
 Imprimir a informação de todos os elementos.
 Eliminar um dado elemento, dado o nome.
 Imprimir os nomes dos elementos de um determinado departamento
A informação a usar de cada elemento é a seguinte:
Atributo Descrição

nome  Nome do elemento da associação
depart   Nome do departamento a que o aluno pertence
proxNome   Apontador para o próximo elemento, ordenadamente por nome
cargo    Cargo que esse elemento desempenha na Associação
*/

