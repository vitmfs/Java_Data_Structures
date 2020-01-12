package ficha04exerc01;

public class Nodo {
	
	private Nodo anterior;
	private int valorDoNodo;
	private Nodo seguinte;
	
	public Nodo(int valorDoNodoT) {
		
		valorDoNodo = valorDoNodoT;
		anterior = null;
		seguinte = null;
		
		
	}


	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anteriorT) {
		anterior = anteriorT;
	}

	public int getValorDoNodo() {
		return valorDoNodo;
	}


	public Nodo getSeguinte() {
		return seguinte;
	}

	public void setSeguinte(Nodo seguinteT) {
		seguinte = seguinteT;
	}


	public String toString() {
		return "Nodo [ " + valorDoNodo + " ]";
	}
	
	
	

}
