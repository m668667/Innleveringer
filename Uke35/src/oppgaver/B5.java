package oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class B5 {

	public static void main(String[] args) {

		for (int karakter = 0; karakter <= 10;) {

			int poeng = parseInt(showInputDialog("Poeng:"));

			if (poeng > 0 && poeng <= 39) {
				showMessageDialog(null, "Karakter: F");

			}

			else if (poeng > 39 && poeng <= 49) {
				showMessageDialog(null, "Karakter: E");

			}

			else if (poeng > 49 && poeng <= 59) {
				showMessageDialog(null, "Karakter: D");

			}

			else if (poeng > 59 && poeng <= 79) {
				showMessageDialog(null, "Karakter: C");

			}

			else if (poeng > 79 && poeng <= 89) {
				showMessageDialog(null, "Karakter: B");

			}

			else if (poeng > 89 && poeng <= 100) {
				showMessageDialog(null, "Karakter: A");

			} else {
				showMessageDialog(null, "Feilmelding");
			}

		}

	}
}
