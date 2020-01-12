package ficha02exerc01;

public class Aluno {
	
	private String nomeAluno;
	private String numeroAluno;
	private Departamento departamento;
	
	public Aluno(String nomeAlunoT, String numeroAlunoT, Departamento departamentoT) {
		super();
		nomeAluno = nomeAlunoT;
		numeroAluno = numeroAlunoT;
		departamento = departamentoT;
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAlunoT) {
		nomeAluno = nomeAlunoT;
	}
	public String getNumeroAluno() {
		return numeroAluno;
	}
	public void setNumeroAluno(String numeroAlunoT) {
		numeroAluno = numeroAlunoT;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamentoT) {
		departamento = departamentoT;
	}
	

}



/*Crie uma classe Aluno a qual deverá conter:
 ATRIBUTOS
o nomeAluno
o numAluno
o departamento
*/
