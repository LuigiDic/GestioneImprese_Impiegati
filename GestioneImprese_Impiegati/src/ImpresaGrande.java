import java.util.HashSet;

public class ImpresaGrande extends Impresa{

	public ImpresaGrande(int codiceImpresa, String denominazione) {
		super(codiceImpresa, denominazione);
	}

	private HashSet <Filiale> filialiG = new HashSet <Filiale>();

	public void addFiliale(Filiale filiale) {
		
		filialiG.add(filiale);
	
	}
	
	
	
	
}
