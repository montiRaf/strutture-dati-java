
public class Studente {
	private int matricola;
	private String cognome;
	private String nome;
	
	public Studente(int matricola, String cognome, String nome) {
		this.matricola = matricola;
		this.cognome = cognome;
		this.nome = nome;
	}
	
	public String toString() {
		return "{" + matricola + " - " + cognome + ", " + nome + "}";
	}
}
