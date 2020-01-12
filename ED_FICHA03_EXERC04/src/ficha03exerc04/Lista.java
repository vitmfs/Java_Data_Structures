package ficha03exerc04;

public class Lista {
	
	private No prim;
	
	public Lista() {
		
		prim = null;
	}
	
	public No getPrim() {
		
		return prim;
	}
	
	public void imprimeLista() {
		
		No temp = prim;
		
		while(temp != null) {
			
			System.out.println(temp);
			
			temp = temp.getProximoNo();
		}
		
		
	}
	
	public void inserirOrdem(int valorT) {
		
		No novoNo = new No(valorT);
		
		if(prim == null) {
			
			prim = novoNo;
			
		} else if (novoNo.getValor() < prim.getValor()) {
			
			novoNo.setProximoNo(prim);
			prim = novoNo;
			
		} else {
			
			No temp = prim.getProximoNo();
			No anterior = prim;
			
			while( temp != null && novoNo.getValor() > temp.getValor() ) {
				
				anterior = temp;
				temp = temp.getProximoNo();

			}
			
			novoNo.setProximoNo(temp);
			anterior.setProximoNo(novoNo);
		}
	}
	
	public No delete(int valorT) {
		
		No apagado;
		
		if(prim == null) {
			
			return null;
			
		} else if (prim.getValor() == valorT) {
			
			apagado = prim;
			prim = prim.getProximoNo();
			return apagado;
			
		} else {
			
			No temp = prim.getProximoNo();
			No anterior = prim;
			
			while(temp != null && temp.getValor() != valorT) {
				
				anterior = temp;
				temp = temp.getProximoNo();
			}
			
			if(temp == null) {
				
				return null;
			}
			
			anterior.setProximoNo(temp.getProximoNo());
			return temp;
			
		}
	}
}

/*
4. Fusão de listas
Dadas duas listas ordenadas, pretende-se construir uma terceira lista que conterá todos os
elementos, sem repetições dessas duas listas. Os nós da lista são números inteiros.
Escreva um programa em Java para:
a) Criar as listas. Cada lista não contém elementos repetidos.
b) Criar a lista resultado conforme descrito.
c) Imprimir os elementos de cada uma das listas.
*/
