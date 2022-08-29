import java.util.HashSet;

public class ImpresaMedia extends Impresa{

	public ImpresaMedia(int codiceImpresa, String denominazione) {
		super(codiceImpresa, denominazione);
	}
	
	private HashSet <Filiale> filiali = new HashSet <Filiale>();
	
	public void addFiliale(Filiale filiale) {
		
		filiali.add(filiale);
	
	}
	
	

	
}
