package it.polito.tdp.anagrammi.ricorsione;

public class TestaRicorsione {

	public static void main(String[] args) {


		CercaAnagramma c = new CercaAnagramma();
		System.out.println("Ritorno corrette: \n");
		for(String stemp:c.ritornaCorrette("mamma")) {
			System.out.println(stemp+"\n");
		}
		System.out.println("Ritorno sbagliate: \n");
		for(String stemp:c.ritornaSbagliate("mamma")) {
			System.out.println(stemp);
		}
	}

}
