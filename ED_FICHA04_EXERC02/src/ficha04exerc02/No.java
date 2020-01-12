package ficha04exerc02;

public class No {
	
	private char letraNo;
	private No nextNo;
	
	public No(char letraNoT) {
		
		letraNo = letraNoT;
		nextNo = null;
	}

	public char getLetraNo() {
		return letraNo;
	}


	public No getNextNo() {
		return nextNo;
	}

	@Override
	public String toString() {
		return "No [letraNo=" + letraNo + "]";
	}

	public void setNextNo(No nextNoT) {
		nextNo = nextNoT;
	}
	
	

}
