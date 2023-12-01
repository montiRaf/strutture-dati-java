
public class TestStack {

	public static void main(String[] args) {
		Studente s1 = new Studente(12, "Rossi", "Mario");
		Studente s2 = new Studente(13, "Verdi", "Paola");
		Studente s3 = new Studente(14, "Neri", "Vittoria");
		Studente s4 = new Studente(15, "Rossi", "Luca");
		Studente s5 = new Studente(16, "Mattei", "Alessandra");
		
		StackArray stack = new StackArray(3);
		stack.push(s1);
		stack.push(s2);
		stack.push(s3);
		
		stack.pop();
		stack.print();
		
		stack.push(s1);
		stack.print();
		stack.push(s5);
		stack.print();
	}

}
