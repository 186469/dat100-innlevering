package InnleveringO;

import javax.swing.JOptionPane;

public class OppgaveO3 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Skriv inn et positivt heltall.");
		Integer tall = Integer.parseInt(input);
		
		int n = tall;
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= i;
			System.out.println("Fakultetet av " +i+ " er: " +result);
		}
		
	}

}
