import java.util.HashSet;

public class Filiale {

	private int codiceIdentificativo;
	private String denominazione;
	
	public Filiale(int codiceIdentificativo, String denominazione) {
		super();
		this.codiceIdentificativo = codiceIdentificativo;
		this.denominazione = denominazione;
	}
	
	private HashSet <Impiegato> impiegati = new HashSet <Impiegato>();

	public int getCodiceIdentificativo() {
		return codiceIdentificativo;
	}

	public void setCodiceIdentificativo(int codiceIdentificativo) {
		this.codiceIdentificativo = codiceIdentificativo;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}

	public HashSet<Impiegato> getImpiegati() {
		return impiegati;
	}

	public void setImpiegati(HashSet<Impiegato> impiegati) {
		this.impiegati = impiegati;
	}
	
	
	
	
	
}
