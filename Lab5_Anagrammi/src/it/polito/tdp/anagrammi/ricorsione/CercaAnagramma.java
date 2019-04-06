package it.polito.tdp.anagrammi.ricorsione;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.polito.tdp.anagrammi.DAO.AnagrammaDAO;

public class CercaAnagramma {
	
	AnagrammaDAO adao = new AnagrammaDAO();
	Map<String, String> soluzioni;
	
	public List<String> ritornaCorrette(String parola){
		List<String> paroleCorrette = new LinkedList<String>();
		for(String stemp:this.genera(parola).values()) {
			if(adao.ritornaParoleCorrette(stemp)) {
				paroleCorrette.add(stemp);
			}
		}
		return paroleCorrette;
	}
	
	public List<String> ritornaSbagliate(String parola){
		List<String> paroleSbagliate = new LinkedList<String>();
		for(String stemp:this.genera(parola).values()) {
			if(!adao.ritornaParoleCorrette(stemp)) {
				paroleSbagliate.add(stemp);
			}
		}
		return paroleSbagliate;
	}
	
	public void CercaAngramma() {
		
	}
	
	public Map<String, String> genera(String s){
		soluzioni = new HashMap<String,String>();
		String parziale = "";
		calcola(s, 0, parziale, soluzioni);
		return soluzioni;
	}
	
	public void calcola(String originale, int L, String parziale, Map<String, String> soluzioni) {
		
		if(L==originale.length()) {
			soluzioni.put(parziale, parziale);
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
