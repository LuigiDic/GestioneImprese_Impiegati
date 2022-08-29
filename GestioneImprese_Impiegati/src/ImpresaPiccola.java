import java.util.HashSet;

public class ImpresaPiccola extends Impresa{

	public ImpresaPiccola(int codiceImpresa, String denominazione) {
		super(codiceImpresa, denominazione);
	}

	private HashSet <Impiegato> impiegati = new HashSet <Impiegato>();

	public HashSet<Impiegato> getImpiegati() {
		return impiegati;
	}

	public void setImpiegati(HashSet<Impiegato> impiegati) {
		this.impiegati = impiegati;
	}
	
	
	
}
