package work;

import work.Dipendente.Dipartimento;

public class Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente primo = new Dipendente("12345abc", Dipartimento.PRODUZIONE);
		Dipendente secondo = new Dipendente("23456abc", Dipartimento.PRODUZIONE);
		Dipendente terzo = new Dipendente("34567abc", Dipartimento.AMMINISTRAZIONE, 50.45, Livello.IMPIEGATO);
		Dipendente quarto = new Dipendente("45678abc", Dipartimento.PRODUZIONE, 40.45, Livello.DIRIGENTE);
//		primo.stampaDatiDipendente();
//		secondo.stampaDatiDipendente();
//		secondo.promuovi();
//		secondo.stampaDatiDipendente();
//		terzo.stampaDatiDipendente();
//		terzo.promuovi();
//		terzo.stampaDatiDipendente();
//		quarto.stampaDatiDipendente();
		
		

		System.out.println("paga di terzo " + Dipendente.calcolaPaga(terzo));
		System.out.println("paga di terzo con straordianri 5 ore " + Dipendente.calcolaPaga(terzo, 5));

		Dipendente[] arr = {primo,secondo,terzo,quarto};
		Personale primoGruppo = new Personale(arr);
		primoGruppo.stampaListaDipendenti();
		
		System.out.println("Paga tot primo gruppo: \n "+ primoGruppo.calcolaTuttiGliStipendi());
		System.out.println("Paga tot primo gruppo con straordinari: \n "+ primoGruppo.calcolaTuttiGliStipendi(5));
		
		primoGruppo.aggiungiDipendente(secondo);
		primoGruppo.aggiungiDipendente(secondo);
		primoGruppo.stampaListaDipendenti();
		System.out.println("Paga tot primo gruppo dopo aggiunta dip: \n "+ primoGruppo.calcolaTuttiGliStipendi());
	}

}
