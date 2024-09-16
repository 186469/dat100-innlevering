package InnleveringO;

import javax.swing.JOptionPane;

public class OppgaveO1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
		
		String input = JOptionPane.showInputDialog("Skriv inn poengsum til elev.");
		Integer poeng = Integer.parseInt(input);
		
		if (poeng > 100 || poeng < 0) {
			System.out.println("Ugyldig poengsum, skriv inn på nytt");
			i = i - 1;
		}
		else {
			if (poeng >= 90) {
				System.out.println("Elev nummer " +i+" får karakter: A");
			}
			else if (poeng >= 80) {
				System.out.println("Elev nummer " +i+ " får karakter: B");
			}
			else if (poeng >= 60) {
				System.out.println("Elev nummer " +i+ " får karakter: C");
			}
			else if (poeng >= 50) {
				System.out.println("Elev nummer " +i+ " får karakter: D");
			}
			else if (poeng >= 40) {
				System.out.println("Elev nummer " +i+ " får karakter: E");
			}
			else {
				System.out.println("Elev nummer " +i+ " får karakter: F");
			}
		}	
		}
	}
}
