package model;

public abstract class Osoba {
	
	private int id;
	private String ime;
	private String prezime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public Osoba() {
		
	}
	
	public Osoba(int id, String ime, String prezime) {
		
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
	}
	
	public abstract void ispisiOsobu(int id, String ime, String prezime);

}
