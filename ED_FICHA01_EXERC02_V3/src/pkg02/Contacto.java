package pkg02;

public class Contacto {
	
	private String nomeDoContacto;
	private String emailDoContacto;
	private String tipoDeContacto;
	
	public Contacto(String nomeDoContactoT, String emailDoContactoT, String tipoDeContactoT) {
		
		
		nomeDoContacto = nomeDoContactoT;
		emailDoContacto = emailDoContactoT;
		tipoDeContacto = tipoDeContactoT;
		
	}
	
	public String toString() {
		
		return "Nome do Contacto: " + nomeDoContacto + " Email do Contacto: " + getEmailDoContacto() + " Tipo de Contacto: " + this.getTipoDeContacto();
	}

	public String getNomeDoContacto() {
		
		return nomeDoContacto;
	}

	public void setNomeDoContacto(String nomeDoContactoT) {
		
		nomeDoContacto = nomeDoContactoT;
	}

	public String getEmailDoContacto() {
		
		return emailDoContacto;
	}

	public void setEmailDoContacto(String emailDoContactoT) {
		
		emailDoContacto = emailDoContactoT;
	}

	public String getTipoDeContacto() {
		
		return tipoDeContacto;
	}

	public void setTipoDeContacto(String tipoDeContactoT) {
		
		tipoDeContacto = tipoDeContactoT;
	}

}
