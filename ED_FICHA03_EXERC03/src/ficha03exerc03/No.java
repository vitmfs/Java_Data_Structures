package ficha03exerc03;

public class No {
	
	public int valorDoNo;
	public No nextNo;
	
	public No(int valorDoNoT) {
		
		valorDoNo = valorDoNoT;
		nextNo = null;
		
	}
	
	public int getValorDoNo() {
		
		return valorDoNo;
	}
	
	public No getNextNo() {
		
		return nextNo;
	}
	
	public void setNextNo(No nextNoT) {
		
		nextNo = nextNoT;
	}
	
	public String toString() {
		
		return "\n" + "||" + getValorDoNo() + "||";
	}

}
