package ficha04exerc02;

public class PilhaLetras {
	
	private No prim;
	
	public PilhaLetras() {
		
		prim = null;
		
	}
	
	public void copyPaste(short x, short y, short z) {
		
		if (prim != null) {
			
			No temp = prim;
			No tempContagem = prim;
			
			for (int j = 1; j <= x + 2 ; j++) {
				
				tempContagem = tempContagem.getNextNo();
				
			}
			
			System.out.println(tempContagem);
			
			for (int i = 1; i < x ; i++) {
				
				temp = temp.getNextNo();
				
				
				
			}
			
			
			
			No inicioLigacao = temp;
			No comecoSegmento = temp.getNextNo();
			
			int in = y - x;
			
			for (in = 1; in < x; in++) {
				
				temp = temp.getNextNo();
				
				
				
			}
			
			System.out.println(comecoSegmento);
			
			inicioLigacao.setNextNo(temp);
			
			//prim = comecoSegmento;
			
			No tempSegmento = comecoSegmento;
			
			for (in = 1; in < x - 2; in++) {
				
				tempSegmento = tempSegmento.getNextNo();
				
				
				
			}
			No fimSegmento = tempSegmento;
			
			System.out.println(tempSegmento);
			
			
			fimSegmento.setNextNo(tempContagem.getNextNo());
			inicioLigacao.setNextNo(comecoSegmento);
			
			
			
			
		}
		
	}
	
	public void push(char novoCharT) {
		
		No novoNo = new No(novoCharT);
		
		if (prim == null) {
			
			prim = novoNo;
			
		} else {
			
			novoNo.setNextNo(prim);
			prim = novoNo;
			
		}
		
	}
	
	public void imprimirLetras() {
		
		No temp = prim;
		
		while (temp != null) {
			
			System.out.println(temp);
			
			temp = temp.getNextNo();
		}
		
	}
	
	public void inserirDadosTeste() {
		
		String inseridaStr = "HOJEHAEXAME";
		
		inseridaStr = inseridaStr.trim();
		
		if (inseridaStr.contains(" ")) {
			
			String[] palavras = inseridaStr.split(" ");
			
			inseridaStr = "";
			
			for (int in = 0; in < palavras.length; in++) {
				
				inseridaStr += palavras[in];
			}
		}
		
		
		for (int i = inseridaStr.length() - 1; i >= 0; i-- ) {
			
			this.push(inseridaStr.charAt(i));
			
		}
		
		
		
	}

}
