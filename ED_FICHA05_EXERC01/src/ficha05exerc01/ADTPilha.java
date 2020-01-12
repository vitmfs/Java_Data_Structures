package ficha05exerc01;

public class ADTPilha {
	
	private No prim;
	
	public ADTPilha() {
		
		prim = null;
		
	}
	
	public String peek() {
		
		if (prim != null) {
			
			return prim.getStrDoNo();
			
		} else {
			
			return "Pilha vazia!";
		}
		
	}
	
	public void push(String novaStrT) {
		
		No novoNo = new No(novaStrT);
		
		if (prim == null) {
			
			prim = novoNo;
			
		} else {
			
			novoNo.setNextNo(prim);
			prim = novoNo;

			
		}

		
	}
	
	public No pop() {
		
		No retirado;
		
		if (prim == null) {
			
			return null;
		} else {
			
			retirado = prim;
			prim = prim.getNextNo();
		}
		
		return retirado;
		
		
	}
	
	public void imprimirPilha() {
		
		No temp = prim;
		
		while (temp != null) {
			
			System.out.println(temp);
			
			temp = temp.getNextNo();
		}
		
		
		
	}
	
	public void inserirDadosTeste() {
		
		this.push("Uma");
		this.push("qualquer");
		this.push("coisa");
		this.push("que me");
		this.push("faz");
		this.push("feliz");
		
		
	}

}
