package InnleveringO;

import javax.swing.JOptionPane;

public class OppgaveO2 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Skriv inn bruttolønn.");
		Integer inntekt = Integer.parseInt(input);
		
		double skatt = 0;
		
		if (inntekt > 1350000) {
			skatt += (inntekt - 1350000) * 0.176;
			inntekt = 1350000;
		}
		if (inntekt > 937900) {
			skatt += (inntekt - 937900) * 0.166;
			inntekt = 937900;
		}
		if (inntekt > 670000) {
			skatt += (inntekt - 670000) * 0.136;
			inntekt = 670000;
		}
		if (inntekt > 292850) {
			skatt += (inntekt - 292850) * 0.04;
			inntekt = 292850;
		}
		if (inntekt > 208050) {
			skatt += (inntekt - 208050) * 0.017;
		}
		JOptionPane.showMessageDialog(null, String.format("Du betaler: %.2f kr i trinnskatt.", skatt));	
	}

}
