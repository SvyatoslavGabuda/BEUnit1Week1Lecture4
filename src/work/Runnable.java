package work;

import work.Dipendente.Dipartimento;

public class Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente primo = new Dipendente("12345abc", Dipartimento.PRODUZIONE);
		primo.stampaDatiDipendente();
		Dipendente secondo = new Dipendente("23456abc",Dipartimento.VENDITE, 50.45,Livello.DIRIGENTE);
		secondo.stampaDatiDipendente();
		secondo.promuovi();
		secondo.stampaDatiDipendente();
		Dipendente terzo = new Dipendente("34567abc",Dipartimento.PRODUZIONE, 40.45,Livello.QUADRO);
		terzo.stampaDatiDipendente();
		terzo.promuovi();
		terzo.stampaDatiDipendente();
		
		System.out.println("paga di terzo "+Runnable.calcolaPaga(terzo));
		System.out.println("paga di terzo con straordianri 5 ore "+Runnable.calcolaPaga(terzo,5));
		
	}
	
	static public double calcolaPaga(Dipendente d) {
		return d.getStipendio();
	}
	static public double calcolaPaga(Dipendente c, int h) {
		return c.getStipendio()+(h*c.getStraordinari());
		
	}
}
