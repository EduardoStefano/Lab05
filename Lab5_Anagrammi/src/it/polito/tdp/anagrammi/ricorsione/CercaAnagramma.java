package it.polito.tdp.anagrammi.ricorsione;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CercaAnagramma {
	
	
	
	public void CercaAngramma() {
		
	}
	
	public List<String> genera(String s){
		List<String> soluzioni = new ArrayList<String>();
		String parziale = "";
		calcola(s, 0, parziale, soluzioni);
		return soluzioni;
	}
	
	public void calcola(String originale, int L, String parziale, List<String> soluzioni) {
		
		if(L==originale.length()) {
			soluzioni.add(parziale);
			return;
		}
		
		for(int i=0; i<originale.length(); i++) {
			if(this.charCount(parziale, originale.charAt(i))<this.charCount(originale, originale.charAt(i))) {
				parziale+=originale.charAt(i);
				calcola(originale, L+1, parziale, soluzioni);
				parziale = parziale.substring(0, parziale.length()-1);
			}
		}
		
	}
	
	private int charCount(String s, char c) {
		int contatore=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==c) {
				contatore++;
			}
		}
		return contatore;
	}

}
