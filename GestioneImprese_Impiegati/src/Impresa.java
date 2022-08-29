import java.util.HashSet;
import java.util.Iterator;

public class Impresa{

	private int codiceImpresa;
	private String denominazione;
	private HashSet <Impiegato> allImpiegati = new HashSet <Impiegato>();
	
	public Impresa(int codiceImpresa, String denominazione) {
		super();
		this.codiceImpresa = codiceImpresa;
		this.denominazione = denominazione;
	}
	
	public void addImpiegato(Impiegato impiegato) throws AggiungiImpiegato{
		
	if(allImpiegati.contains(impiegato)) {
		throw new AggiungiImpiegato("Impossibile aggiungere impiegato.");
	}else {
		
		allImpiegati.add(impiegato);
	}
	}
	
	public void rimuoviImpiegato(String codiceImpiegato) {
		
		int sentinella = 0;
		Iterator <Impiegato> it1 = allImpiegati.iterator();
		while(it1.hasNext()) {
			
			if(it1.next().getCodiceImpiegato().compareTo(codiceImpiegato) == 0) {
				
				sentinella =1;
				it1.remove();}}
		if (sentinella == 0) {
			
				System.out.println("\n Impiegato non trovato\n");
			}
			
		}
	
	public int getCodiceImpresa() {
		return codiceImpresa;
	}

	public void setCodiceImpresa(int codiceImpresa) {
		this.codiceImpresa = codiceImpresa;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}
	
	

	@Override
	public String toString() {
		return "Impresa [codiceImpresa=" + codiceImpresa + ", denominazione=" + denominazione + ", allImpiegati="
				+ allImpiegati + "]";
	}
	
}
