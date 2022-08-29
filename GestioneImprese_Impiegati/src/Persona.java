
public class Persona {
	
	private String codicePersona;
	private String nome, cognome;
	
	public Persona(String codicePersona, String nome, String cognome) {
		super();
		this.codicePersona = codicePersona;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getCodicePersona() {
		return codicePersona;
	}

	public void setCodicePersona(String codicePersona) {
		this.codicePersona = codicePersona;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	

}
