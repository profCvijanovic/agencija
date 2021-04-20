package model;

import java.util.ArrayList;
import java.util.List;

public class Agencija {
	
	private double budzet;
	private List<Zaposleni> listaZaposlenih = new ArrayList<Zaposleni>();
	
	public Agencija() {
		
	}
	
	public double getBudzet() {
		return budzet;
	}
	public void setBudzet(double budzet) {
		this.budzet = budzet;
	}
	public List<Zaposleni> getListaZaposlenih() {
		return listaZaposlenih;
	}
	public void setListaZaposlenih(List<Zaposleni> listaZaposlenih) {
		this.listaZaposlenih = listaZaposlenih;
	}
	
	public double ukupniTroskovi(double zarade, double pdv, double bonusi) {
		return zarade + pdv + bonusi;
	}
	
	public void daLiImaDovoljnoNovcaUbudzetu(double ukupniTroskovi, double budzet) {
		
		double ostatak = budzet - ukupniTroskovi;
		
		if(ostatak > 0) {
			System.out.println("Ima jos " + ostatak + " novca u budzetu!");
		}else {
			System.out.println("U minusu smo " + ostatak);
		}
		
	}
	
	

}
