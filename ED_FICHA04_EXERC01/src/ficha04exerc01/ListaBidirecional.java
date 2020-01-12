package ficha04exerc01;

public class ListaBidirecional {
	
	private Nodo prim;
	private Nodo ult;
	
	public ListaBidirecional() {
		
		prim = null;
		ult = null;
		
	}
	
	public void inserirOrdenadamente(int valorNovoT) {
		
		Nodo novoNo = new Nodo(valorNovoT);
		
		if (prim == null) {
			
			prim = novoNo;
			ult = novoNo;
			
		} else if ( novoNo.getValorDoNodo() <= prim.getValorDoNodo() ) {
			
			novoNo.setSeguinte(prim);
			prim = novoNo;
			
		} else if ( novoNo.getValorDoNodo() >= ult.getValorDoNodo() ) {
			
			ult.setSeguinte(novoNo);
			novoNo.setAnterior(ult);
			ult = novoNo;

		} else {
			
			
			
			Nodo temp = prim.getSeguinte();
			
			while ( novoNo.getValorDoNodo() >= temp.getValorDoNodo() ) {
				
				temp = temp.getSeguinte();
				
			}
			
			novoNo.setSeguinte(temp);
			novoNo.setAnterior(temp.getAnterior());
			temp.getAnterior().setSeguinte(novoNo);
			temp.setAnterior(novoNo);

			
		}
	

	}
	
	public void inserirDadosTeste() {
		
		
		this.inserirOrdenadamente(2);
		this.inserirOrdenadamente(2);
		this.inserirOrdenadamente(2);
		this.inserirOrdenadamente(13);
		this.inserirOrdenadamente(5);
		this.inserirOrdenadamente(20);
		this.inserirOrdenadamente(100);
		this.inserirOrdenadamente(45);
		this.inserirOrdenadamente(44);
		this.inserirOrdenadamente(23);
		this.inserirOrdenadamente(13);
		this.inserirOrdenadamente(13);
		this.inserirOrdenadamente(100);
		this.inserirOrdenadamente(45);
		
		//this.inserirOrdenadamente(5);
		
		
		


	}
	
	public void apagarNodos(int valorParaApagarT) {
		
		
		
		if (prim == null && ult == null) {
			
			return;
			
		} else if (prim.getValorDoNodo() == valorParaApagarT) {
			
			while (prim.getValorDoNodo() == valorParaApagarT) {
				
				prim = prim.getSeguinte();
				prim.setAnterior(null);
				
				
			}
			
			
			
		} else if (ult.getValorDoNodo() == valorParaApagarT) {
			
			System.out.println("222");
			
			while (ult.getValorDoNodo() == valorParaApagarT) {
				
				if (ult != null) {
					
					ult = ult.getAnterior();
					ult.setSeguinte(null);
					
				}
				
			}
			
			
			
		} else {
			
			Nodo temp = prim;
			
			while (temp != null && temp.getValorDoNodo() != valorParaApagarT ) {
				
				temp = temp.getSeguinte();
			}
			
			
			if (temp != null) {
				
				Nodo comeca = temp.getAnterior();
				
				System.out.println("Entrei!");
				
				Nodo encontrado = temp;
				
				while (temp.getValorDoNodo() == encontrado.getValorDoNodo()) {
					
					temp = temp.getSeguinte();
				}
				
				
				if (comeca != null)	{
					
					comeca.setSeguinte(temp);
				}
				
				

				if (temp != null)	{
					
					temp.setAnterior(comeca);
				}
				
			}
			
		}
		
		
		
		
		
		
	}
	
	public void imprimirNodos() {
		
		Nodo temp = prim;
		
		while (temp != null) {
			
			System.out.println(temp);
			temp = temp.getSeguinte();
		}
		
		
		
	}

}

/*
 * public void apagarNodos(int valorParaApagarT) {
		
		//if (prim == null)
		
		
		Nodo temp = prim;
		
		while (temp != null && temp.getValorDoNodo() != valorParaApagarT ) {
			
			temp = temp.getSeguinte();
		}
		
		System.out.println("temp = " + temp);
		
		
		
		if (temp != null) {
			
			Nodo comeca = temp.getAnterior();
			
			System.out.println("Entrei!");
			
			Nodo encontrado = temp;
			
			while (temp.getValorDoNodo() == encontrado.getValorDoNodo()) {
				
				//System.out.println("temp = " + temp);
				//System.out.println("encontrado = " + encontrado);
				
				temp = temp.getSeguinte();
			}
			
			//temp = temp.getSeguinte();
			
			System.out.println("temp = " + temp);
			
			
			if (comeca != null)	{
				
				comeca.setSeguinte(temp);
			}
			
			

			if (temp != null)	{
				
				temp.setAnterior(comeca);
			}
				
				
			
			
			
			
		}
		
		
	}
	*/
