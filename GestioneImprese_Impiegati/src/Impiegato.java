
public class Impiegato extends Persona{

	private String codiceImpiegato;
	private String dataAssunzione;
	private int stipendioIniziale;
	
	public Impiegato(String codicePersona, String nome, String cognome, String codiceImpiegato, String dataAssunzione, int stipendioIniziale) {
		super(codicePersona, nome, cognome);
		
		this.codiceImpiegato = codiceImpiegato;
		this.dataAssunzione = dataAssunzione;
		this.stipendioIniziale = stipendioIniziale;
	
	}

	public String getCodiceImpiegato() {
		return codiceImpiegato;
	}

	public void setCodiceImpiegato(String codiceImpiegato) {
		this.codiceImpiegato = codiceImpiegato;
	}

	public String getDataAssunzione() {
		return dataAssunzione;
	}

	public void setDataAssunzione(String dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}

	public int getStipendioIniziale() {
		return stipendioIniziale;
	}

	public void setStipendioIniziale(int stipendioIniziale) {
		this.stipendioIniziale = stipendioIniziale;
	}

	@Override
	public String toString() {
		return "Impiegato [codiceImpiegato=" + codiceImpiegato + ", dataAssunzione=" + dataAssunzione
				+ ", stipendioIniziale=" + stipendioIniziale + "]";
	}
	
	

}
