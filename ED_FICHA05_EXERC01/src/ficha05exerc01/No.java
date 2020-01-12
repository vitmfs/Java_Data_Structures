package ficha05exerc01;

public class No {
	
	private String strDoNo;
	private No nextNo;
	
	public No(String strDoNoT) {
		
		strDoNo = strDoNoT;
	}

	public String getStrDoNo() {
		return strDoNo;
	}

	public No getNextNo() {
		return nextNo;
	}

	public void setNextNo(No nextNoT) {
		nextNo = nextNoT;
	}

	@Override
	public String toString() {
		return "No [strDoNo = " + strDoNo  + " ]";
	}
	
	
	

}
