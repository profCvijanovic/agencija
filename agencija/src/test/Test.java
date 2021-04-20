package test;

import java.util.ArrayList;
import java.util.List;

import logic.Racunovodstvo;
import model.Agencija;
import model.Zaposleni;

public class Test {

	public static void main(String[] args) {
		
		Zaposleni zaposleni1 = new Zaposleni();
			zaposleni1.setId(1);
			zaposleni1.setIme("Pera");
			zaposleni1.setPrezime("Peric");
			zaposleni1.setPlata(100000);
			zaposleni1.setTarget(12);
			zaposleni1.daLiZaposleniImaBonus();
		zaposleni1.ispisiOsobu(zaposleni1.getId(), zaposleni1.getIme(), zaposleni1.getPrezime());

		Zaposleni zaposleni2 = new Zaposleni();
			zaposleni2.setId(2);
			zaposleni2.setIme("Miki");
			zaposleni2.setPrezime("Mikic");
			zaposleni2.setPlata(50000);
			zaposleni2.setTarget(9);
			zaposleni2.daLiZaposleniImaBonus();
			zaposleni2.ispisiOsobu(zaposleni2.getId(), zaposleni2.getIme(), zaposleni2.getPrezime());

		
		Zaposleni zaposleni3 = new Zaposleni(3,"Ana","Anic",100000,11,false);
			zaposleni3.daLiZaposleniImaBonus();
			zaposleni3.ispisiOsobu(zaposleni3.getId(), zaposleni3.getIme(), zaposleni3.getPrezime());
		
		List<Zaposleni> lista = new ArrayList<Zaposleni>();
			lista.add(zaposleni1);
			lista.add(zaposleni2);
			lista.add(zaposleni3);
		
		Agencija agencija = new Agencija();
			agencija.setBudzet(500000);
			agencija.setListaZaposlenih(lista);
		
		double plate = Racunovodstvo.racunajTroskoveZarade(agencija.getListaZaposlenih());
			System.out.println("Plate ukupno: " + plate);
		double bonusi = Racunovodstvo.racunajBonuse(agencija.getListaZaposlenih());
			System.out.println("Bonusi ukupno: " + bonusi);
		double pdv = Racunovodstvo.racunajPDV(plate, bonusi);
			System.out.println("PDV ukupno: " + pdv);
		double ukupniTroskovi = agencija.ukupniTroskovi(plate, pdv, bonusi);
		System.out.println("Ukupni troskovi: " + ukupniTroskovi);
		agencija.daLiImaDovoljnoNovcaUbudzetu(ukupniTroskovi, agencija.getBudzet());
			
			
			
	}

}
