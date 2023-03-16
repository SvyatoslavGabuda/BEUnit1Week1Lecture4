package work;

import java.util.Date;

public class Persona {
	 public String nome;
	public String cognome;
	public Date nascita;
	
	public Persona(String n,String c) {
		this.nome=n;
		this.cognome=c;
	}
	
	public void setDate(Date d) {
		this.nascita=d;
	}
	
	
}
