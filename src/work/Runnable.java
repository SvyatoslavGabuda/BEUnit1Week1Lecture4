package work;

import work.Dipendente.Dipartimento;

public class Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente primo = new Dipendente("Mario","Rossi","12345abc", Dipartimento.PRODUZIONE);
		Dipendente secondo = new Dipendente("Luigi","Verdi","23456abc", Dipartimento.PRODUZIONE);
		Dipendente terzo = new Dipendente("Carlo","Gialli","34567abc", Dipartimento.AMMINISTRAZIONE, 50.45, Livello.IMPIEGATO);
		Dipendente quarto = new Dipendente("Stefano","Bianchi","45678abc", Dipartimento.PRODUZIONE, 40.45, Livello.DIRIGENTE);
		Dipendente quinto = new Dipendente("Michele","Rossi","234634abc", Dipartimento.VENDITE, 35.80, Livello.IMPIEGATO);
		Dipendente sesto = new Dipendente("Roberto","Verdi","57891abc", Dipartimento.VENDITE, 46.89, Livello.QUADRO);
//		primo.stampaDatiDipendente();
//		secondo.stampaDatiDipendente();
		secondo.promuovi();
//		secondo.stampaDatiDipendente();
//		terzo.stampaDatiDipendente();
		terzo.promuovi();
//		terzo.stampaDatiDipendente();
		quarto.stampaDatiDipendente();
		System.out.println(quarto);
		
		

		System.out.println("paga di  " +terzo.nome+" " + Dipendente.calcolaPaga(terzo));
		System.out.println("paga con straordianri 5 ore di "+terzo.nome +" " + Dipendente.calcolaPaga(terzo, 5));

		Dipendente[] arr = {primo,secondo,terzo,quarto};
		Personale primoGruppo = new Personale(arr);
		primoGruppo.stampaListaDipendenti();
		
		System.out.println("Paga tot primo gruppo: \n "+ primoGruppo.calcolaTuttiGliStipendi());
		System.out.println("Paga tot primo gruppo con straordinari: \n "+ primoGruppo.calcolaTuttiGliStipendi(5));
		
		primoGruppo.aggiungiDipendente(quinto);
		primoGruppo.aggiungiDipendente(sesto);
		primoGruppo.stampaListaDipendenti();
		System.out.println("Paga tot primo gruppo dopo aggiunta dip: \n "+ primoGruppo.calcolaTuttiGliStipendi());
		
	}

}
