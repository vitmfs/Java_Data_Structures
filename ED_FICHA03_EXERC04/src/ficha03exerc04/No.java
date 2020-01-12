package ficha03exerc04;

public class No {
	
	private int valor;
	private No proximoNo;
	
	public No(int valorT) {
		
		valor = valorT;
		
	}
	
	public String toString() {
		
		return "Valor: " + getValor();
	}
	
	public int getValor() {
		
		return valor;
	}
	
	public No getProximoNo() {
		
		return proximoNo;
	}
	
	public void setProximoNo(No proximoNoT) {
		
		proximoNo = proximoNoT;
	}

}
