package ficha03exerc03;

public class Lista {
	
	private No prim;
	
	public Lista() {
		
		prim = null;
	}
	
	
	
	public No pesquisar(int valorAPesquisarT) {
		
		No noAInserir;
		
		if( prim == null) {
			
			return null;
			
		} else if (prim.getValorDoNo() == valorAPesquisarT ) {
			
			return prim;
			
		} else {
			
			No temp = prim.getNextNo();
			No anterior = prim;
			
			while( temp != null && temp.getValorDoNo() != valorAPesquisarT) {
				
				anterior = temp;
				temp = temp.getNextNo();
			}
			
			if(temp != null) {
				
				noAInserir = temp;
				anterior.setNextNo(temp.getNextNo());
				noAInserir.setNextNo(prim);
				prim = noAInserir;
				
				
			}
			
			return temp;
		}

		
	}
	
	public void insereNoFim(int valorAInserirT) {
		
		No noAInserir = new No(valorAInserirT);
		
		if(prim == null) {
			
			prim = noAInserir;
		} else {
			
			No temp = prim;
			
			while( temp.getNextNo() != null ) {
				
				temp = temp.nextNo;
			}
			
			temp.setNextNo(noAInserir);
			
		}
		
	}
	
	public void imprimirLista() {
		
		No temp = prim;
		
		while( temp != null ) {
			
			System.out.println(temp);
			temp = temp.getNextNo();
			
		}
	}
	
	public void loadDummyData() {
		
		
		this.insereNoFim(1);
		this.insereNoFim(50);
		this.insereNoFim(100);
		
		
		//this.imprimirLista();
	}
		

}

/*
 * 3. M�todo �mover para frente�
Por vezes a ordem pela qual os elementos est�o armazenados numa lista n�o � importante.
Pode-se, frequentemente, acelerar a pesquisa com um m�todo designado �mover para frente�:
sempre que um item � acedido, ele � movido para o in�cio da lista. Esta ac��o resulta
normalmente numa melhoria, pois os itens mais requisitados tendem a deslocar-se para o in�cio
da lista, enquanto que os menos requisitados v�o ficando no fim da lista. Escreva um programa
que permita implementar e testar este m�todo �mover para frente�.
*/
