package oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class B5 {

	public static void main(String[] args) {
		
		for (int karakter=0; karakter<=10; ) {

			int poeng = parseInt (showInputDialog("Poeng:") );
		
		if (poeng > 0 && poeng <= 39 ) {
			showMessageDialog(null, "Karakter: F");
			
		}
			
		if (poeng > 39 && poeng <= 49) {
			showMessageDialog(null, "Karakter: E");
				
		}
				
		if (poeng > 49 && poeng <= 59) {
			showMessageDialog(null, "Karakter: D");
			
		}
		
		if (poeng > 59 && poeng <= 79) {
			showMessageDialog(null, "Karakter: C");
			
		}
		
		if (poeng > 79 && poeng <= 89) {
			showMessageDialog(null, "Karakter: B");
		
		}
		
		if (poeng > 89 && poeng <= 100) {
				showMessageDialog(null, "Karakter: A");
		
		}
		
		if (poeng > 100) {
				showMessageDialog(null, "Feilmelding");
				
		}
				
		if (poeng <= -1) {
				showMessageDialog(null, "Feilmelding");
	
		}

	}

	}
}
