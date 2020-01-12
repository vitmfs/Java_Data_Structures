package pkg02;

public class ListaDeContactos {

	private int tamanhoDaLista;
	private Contacto[] contactos;
	private int ultPosOcupada;

	public ListaDeContactos(int tamanhoDaListaT) {

		tamanhoDaLista = tamanhoDaListaT;
		contactos = new Contacto[tamanhoDaLista];
		ultPosOcupada = -1;

	}

	public int totalDeContactos() {

		int numeroDeContactos = 0;

		for (int i = 0; i < tamanhoDaLista; i++) {

			if ((contactos[i] != null)) {

				numeroDeContactos++;
			}
		}

		return numeroDeContactos;
	}

	public boolean removerContacto(String nomeAPesquisarT, String emailAPesquisarT) {

		try {
			
			int encontradoNaPosicao = -1; // inicializo a posição onde ele está

			if (pesquisarContacto(nomeAPesquisarT, emailAPesquisarT) != null) {

				for (int i = 0; i < tamanhoDaLista; i++) {

					if (contactos[i].getNomeDoContacto().equals(nomeAPesquisarT) && 
							contactos[i].getEmailDoContacto().equals(emailAPesquisarT)) {

						encontradoNaPosicao = i; // guardamos o indice da posição encontrada
									
						break;

					}

				}

				contactos[encontradoNaPosicao] = null; // apagamos (igualamos a
														// null) na posição onde o
														// email encontrado estava

				for (int x = encontradoNaPosicao; x < ultPosOcupada; x++) {

					contactos[x] = contactos[x + 1];
				}

				contactos[ultPosOcupada] = null;

				ultPosOcupada--;
				
				return true;	

			} else {
				
				return false;

				//System.out.println("O contacto não existe!");
			}
			
		} catch (Exception e) {
			
			return false;
		}
		
	}

	

	public Contacto pesquisarContacto(String nomeAPesquisarT, String emailAPesquisarT) {

		for (int i = 0; i < tamanhoDaLista; i++) {

			if (contactos[i].getNomeDoContacto().trim().toLowerCase().equals(nomeAPesquisarT.trim().toLowerCase()) && 
				contactos[i].getEmailDoContacto().trim().toLowerCase().equals(emailAPesquisarT.trim().toLowerCase())) {

				return contactos[i];

			}

		}

		System.out.println("Contacto não encontrado!");

		return null;
	}

	public void imprimirContactosDaLista() {

		System.out.println("\n");

		for (int i = 0; i < tamanhoDaLista; i++) {

			System.out.println(contactos[i]);

		}
	}

	/**
	 * Insere Contacto
	 * 
	 * @param emailContactoT
	 */
	public void inserirContacto(Contacto contactoT) {

		int i = 0;

		if (!isCheia()) { // se não estiver cheia

			if (isContactoValido(contactoT.getNomeDoContacto(), contactoT.getEmailDoContacto(),
					contactoT.getTipoDeContacto())) { // se o contacto for
														// válido

				if (isVazia()) {

					contactos[0] = contactoT;
					ultPosOcupada++;
					System.out.println("Aqui estou no isVazia");

				} else {

					while (contactoT.getNomeDoContacto().compareTo(contactos[i].getNomeDoContacto()) > 0
							&& (i < contactos.length)) {

						//System.out.println("Estou no contactos[i] : " + i);

						i++;
						
						//System.out.println(i);
					}
					
					for (int j = contactos.length - 2; j >= i; j--) {

						contactos[j + 1] = contactos[j];
					}

					contactos[i] = contactoT;
					
				}

				// contactos[++ultPosOcupada] = contactoT; // primeiro
				// incrementa a ultima posição ocupada e depois insere o
				// contacto dado como parâmetro

			} else {

				System.out.println("\nO contacto não é válido! Email não inserido");
			}
		} else {

			System.out.println("\nLista cheia! Liberte espaço e tente novamente!");
		}

	}

	public static boolean isContactoValido(String nomeDoContactoT, String emailDoContactoT, String tipoDoContactoT) {

		if (((emailDoContactoT.length() >= 8) && (emailDoContactoT.contains("@")) && (emailDoContactoT.contains(".")))
				&& (nomeDoContactoT.length() >= 3) && (tipoDoContactoT.length() >= 3)) {

			return true;

		} else {

			return false;
		}
	}

	/**
	 * vê se a lista está vazia
	 * 
	 * @return
	 */
	public boolean isVazia() {

		return (contactos[0] == null);
	}

	/**
	 * vê se a lista está cheia
	 * 
	 * @return
	 */
	public boolean isCheia() {

		return (ultPosOcupada == tamanhoDaLista - 1);

	}

}
