package work;

public class Dipendente {

	static final private double stipendioBase = 800;



	enum Dipartimento {
		PRODUZIONE, AMMINISTRAZIONE, VENDITE,
	}

	private String id;
	private double importoOrarioStraordinario;
	private Livello livello = Livello.OPERAIO;
	private Dipartimento dipartimento;
	private double stipendio;

	public Dipendente(String id, Dipartimento dipartimento) {
		this.id = id;
		this.dipartimento = dipartimento;
		this.importoOrarioStraordinario = 30;
//		this.livello = Livello.OPERAIO;
		this.stipendio = aggiornaStipendio();

	}

	public Dipendente(String id, Dipartimento dipartimento, Double importo, Livello livello) {
		this(id, dipartimento);
		this.importoOrarioStraordinario = importo;
		this.livello = livello;
		this.stipendio = aggiornaStipendio();
	}

	public void stampaDatiDipendente() {
		System.out.println(" \t--Dipendente--\t \nMarticola: " + this.id);
		System.out.println("Livello: " + this.livello);
		System.out.println("Dipartimento: " + this.dipartimento);
		System.out.println("Salario: " + this.stipendio);
		System.out.println("Straordinario: " + this.importoOrarioStraordinario + "\n\n");
	}

	public void promuovi() {
		switch (this.livello) {
		case OPERAIO:
			this.livello = Livello.IMPIEGATO;
			this.stipendio = aggiornaStipendio();
			System.out.println(this.id +"PROMOSSO A " + this.livello +"\n");
			break;
		case IMPIEGATO:
			this.livello = Livello.QUADRO;
			this.stipendio = aggiornaStipendio();
			System.out.println(this.id +"PROMOSSO A " + this.livello +"\n");
			break;
		case QUADRO:
			this.livello = Livello.DIRIGENTE;
			this.stipendio = aggiornaStipendio();
			System.out.println(this.id +"PROMOSSO A " + this.livello +"\n");
			break;
		case DIRIGENTE:
			System.out.println("ERRORE, il dipendente ha già il livello massimo \n livello: " + this.livello +"\n");
			break;
		default:
			System.out.println("ERRORE, non è stato possibile definire il caso \n");
			break;
		}
	}
	
	public double getStipendio () {
		return this.stipendio;
	}
	public double getStraordinari() {
		return this.importoOrarioStraordinario;
	}

	private double aggiornaStipendio() {
		switch (this.livello) {
		case OPERAIO:
			return Dipendente.stipendioBase;

		case IMPIEGATO:
			return Dipendente.stipendioBase * 1.2;

		case QUADRO:
			return Dipendente.stipendioBase * 1.5;

		case DIRIGENTE:
			return Dipendente.stipendioBase * 2;

		default:
			System.out.println("ERRORE, non è stato possibile definire il caso \n");
			return Dipendente.stipendioBase;
		}

	}
	

}
