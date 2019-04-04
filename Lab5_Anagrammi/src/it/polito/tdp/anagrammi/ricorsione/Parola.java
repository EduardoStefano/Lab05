package it.polito.tdp.anagrammi.ricorsione;

import java.util.ArrayList;
import java.util.List;

public class Parola {
	
	private int size;
	private String parola;
	private List<String> soluzioni;
	
	public boolean contains(String i) {
		return this.parola.contains(i);
	}
	
	public Parola(String parola) {
		super();
		this.parola = parola;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
	
	public void add(char c) {
		this.parola+=c;
	}

	public void remove(char c) {
		for(int i=0; i<this.parola.length(); i++) {
			if(this.parola.charAt(i)==c) {
				this.parola.substring(i, this.parola.length());
			}
		}
	}
	
	public List<String> dammiSoluzioni(){
		return this.soluzioni;
	}
	
	public char dammiCarattere(int i) {
		return this.parola.charAt(i);
	}
	
	public boolean contains(char c) {
		for(int i=0; i<this.parola.length(); i++) {
			if(this.parola.charAt(i)==c) {
				return true;
			}
		}
		return false;
	}
	

}
