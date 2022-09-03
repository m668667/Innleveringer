package oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class B4 {

	public static void main(String[] args) {
		
		int inntekt = parseInt (showInputDialog("Bruttoinntekt:") );
		
		if (inntekt <= 190350 ) {
			showMessageDialog(null, "Ingen trinnskatt");
			
		}
			
		if (inntekt > 190350 && inntekt < 267900) {
			showMessageDialog(null, "Trinn 1");
				
		}
				
		if (inntekt > 267900 && inntekt < 643799) {
			showMessageDialog(null, "Trinn 2");
			
		}
		
		if (inntekt > 643799 && inntekt < 969199) {
			showMessageDialog(null, "Trinn 3");
			
		}
		
		if (inntekt > 969199 && inntekt < 1999999) {
			showMessageDialog(null, "Trinn 4");
		
		}
		
		if (inntekt > 1999999) {
				showMessageDialog(null, "Trinn 5");
		
		}
		
	}


}
