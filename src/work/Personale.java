package work;

public class Personale  {
 Dipendente[] persone; 
 
 
 public void aggiungiDipendente(Dipendente d) {
	 Dipendente[] nuovo = new Dipendente[this.persone.length+1];
	 for(int i = 0; i<this.persone.length;i++) {
		 nuovo[i]=persone[i];
		 	 }
	 nuovo[this.persone.length] = d;
	 persone = nuovo;
 }
 public Personale(Dipendente[] D) {
	 persone= D;
 }
 
 public double calcolaTuttiGliStipendi () {
	 double tot = 0;
	 for(int i = 0;i<this.persone.length;i++) {
		 
		 tot+= Dipendente.calcolaPaga(persone[i]);
	 }
	 return tot;
 }
 public double calcolaTuttiGliStipendi (int oreStraordinario) {
	 double tot = 0;
	 for(int i = 0;i<this.persone.length;i++) {
		 
		 tot+= Dipendente.calcolaPaga(persone[i], oreStraordinario);
	 }
	 return tot;
 }
 public void stampaListaDipendenti() {
	 for(int i =0;i<this.persone.length;i++) {
		 System.out.println("persona " +i);
		 persone[i].stampaDatiDipendente();
		 
	 }
 }
}
