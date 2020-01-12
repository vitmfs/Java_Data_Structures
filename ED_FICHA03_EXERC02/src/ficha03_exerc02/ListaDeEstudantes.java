package ficha03_exerc02;

public class ListaDeEstudantes {

	private Estudante primEstudante;

	public ListaDeEstudantes() {

		primEstudante = null; // para indentar o código no Eclipse ctrl+shift+f

	}

	public Estudante eliminarEstudante(String nomeAEliminarT) {

		if (primEstudante.getNome().equals(nomeAEliminarT)) {

			Estudante estudanteEliminado = primEstudante;
			primEstudante = primEstudante.getProxEstudante();
			return estudanteEliminado;
		}

		Estudante temp = primEstudante.getProxEstudante();
		Estudante anteriorEstudante = primEstudante;

		while (!(temp.getNome().equals(nomeAEliminarT)) && (temp != null)) {

			anteriorEstudante = temp;
			temp = temp.getProxEstudante();
		}

		if (temp == null) {

			return null;
		}

		anteriorEstudante.setProxEstudante(temp.getProxEstudante());

		return temp;

	}

	public void imprimirEstudantesDepartamento(String departamentoAImprimirT) {

		Estudante temp = primEstudante;

		while (temp != null) {

			if (temp.getDepartamento().equals(departamentoAImprimirT)) {

				System.out.println(temp);
			}

			temp = temp.getProxEstudante();
		}
	}

	public void imprimirEstudantes() {

		Estudante temp = primEstudante;

		while (temp != null) {

			System.out.println(temp);

			temp = temp.getProxEstudante();
		}
	}

	public void inserirAlfabeticamente(String nomeInseridoT, String departamentoInseridoT, String cargoT) {

		Estudante novoEstudante = new Estudante(nomeInseridoT, departamentoInseridoT, cargoT);

		if (primEstudante == null) {

			primEstudante = novoEstudante;
		} else if (novoEstudante.getNome().compareTo(primEstudante.getNome()) < 0) {

			novoEstudante.setProxEstudante(primEstudante); // ligasse o novo
															// estudante ao 1º
															// estudante da
															// lista
			primEstudante = novoEstudante; // o 1º estudante passa a ser o novo
											// estudante
			// == só dentro das condições boleanas
		} else {

			Estudante temp = primEstudante.getProxEstudante();
			Estudante anteriorTemp = primEstudante;

			while ((temp != null) && (novoEstudante.getNome().compareTo(temp.getNome()) > 0)) {

				anteriorTemp = temp;
				temp = temp.getProxEstudante();

			}

			novoEstudante.setProxEstudante(temp);
			anteriorTemp.setProxEstudante(novoEstudante);
		}

	}

	public void loadDummyData() {

		this.inserirAlfabeticamente("Ana", "História", "Presidente");
		inserirAlfabeticamente("Marcelo", "Turismo", "Tesoureiro");
		inserirAlfabeticamente("Olavo", "Turismo", "Cargo40");
		this.inserirAlfabeticamente("Jonas", "Informática", "Cargueiro");

	}
}
