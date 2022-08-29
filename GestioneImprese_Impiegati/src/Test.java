
public class Test {

	public static void main(String[] args) throws AggiungiImpiegato {

		Impiegato impiegato1 = new Impiegato ("GID4RI", "Mario", "Rossi", "IORN4ER", "10/12/2020", 1900);
		Impiegato impiegato2 = new Impiegato ("GID3RI", "Luca", "Bianchi", "IR9433R", "1/12/2020", 1800);
		Impiegato impiegato3 = new Impiegato ("LAI343", "Antonio", "Veri", "IORT4ER", "10/04/2020", 1850);
		
		Impresa impresa1 = new Impresa (1,"Impresa1" );
		Impresa impresa2 = new Impresa (2,"Impresa2" );
		Impresa impresa3 = new Impresa (3,"Impresa3" );
		
		impresa1.addImpiegato(impiegato1);
		impresa1.addImpiegato(impiegato2);
		System.out.println(impresa1.toString()); //Aggiunta 2 impiegati
		
		impresa1.rimuoviImpiegato("IR9433R"); //rimozione impiegato1
		System.out.println(impresa1.toString()); // Verifica rimozione
		//impresa1.addImpiegato(impiegato1);   Test exception OK
		
		impresa1.rimuoviImpiegato("IORT4ER"); //prova rimozione impiegato non presente
		
		impresa2.addImpiegato(impiegato2);
		impresa3.addImpiegato(impiegato3);
		System.out.println(impiegato1);
		
	}

}
