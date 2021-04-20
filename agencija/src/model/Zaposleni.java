package model;

import interfejsovi.Ibonus;

public class Zaposleni extends Osoba implements Ibonus {

	private double plata;
	private int target;
	private boolean bonus;
		
	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public boolean isBonus() {
		return bonus;
	}

	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}

	
	public Zaposleni() {
		
	}
	
	public Zaposleni(int id, String ime, String prezime, double plata, int target, boolean bonus) {
		super(id,ime,prezime);
		this.plata = plata;
		this.target = target;
		this.bonus = bonus;
	}

	@Override
	public void ispisiOsobu(int id, String ime, String prezime) {
		
		System.out.println("Id zaposlenog: " + id);
		System.out.println("Ime zaposlenog: " + ime);
		System.out.println("Prezime zaposlenog: " + prezime);
		
	}

	@Override
	public void daLiZaposleniImaBonus() {	
		
		if(this.target > 10) {
			this.bonus = true;
		}else {
			this.bonus = false;
		}	
		
		System.out.println("Bonus: " + bonus);
	}


}
