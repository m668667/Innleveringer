import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Oppgave1 {

	public static void main(String[] args) {

		double inntekt = parseInt(showInputDialog("Bruttoinntekt:"));
		int trinn1 = 190350;
		int trinn2 = 267900;
		int trinn3 = 643800;
		int trinn4 = 969299;
		int trinn5 = 2000000;
		double pros1 = 1.7 / 100;
		double pros2 = 4.0 / 100;
		double pros3 = 13.4 / 100;
		double pros4 = 16.4 / 100;
		double pros5 = 17.4 / 100;

		if (inntekt <= 190350 && inntekt >= 0) {
			showMessageDialog(null, "Ingen trinnskatt");

		}

		else if (inntekt >= trinn1 && inntekt < trinn2) {
			showMessageDialog(null, "Trinn 1" + "\n Din inntekt: " + inntekt + "\n Trinnskatt å betale: "
					+ String.format("%.2f", (inntekt - trinn1) * pros1) + " kr ");

		}

		else if (inntekt >= trinn2 && inntekt < trinn3) {
			showMessageDialog(null, "Trinn 2" + "\n Din inntekt: " + inntekt + "\n Trinnskatt å betale: "
					+ String.format("%.2f", ((inntekt - trinn2) * pros2 + (trinn2 - trinn1) * pros1)) + " kr ");

		}

		else if (inntekt >= trinn3 && inntekt < trinn4) {
			showMessageDialog(null,
					"Trinn 3" + "\n Din inntekt: " + inntekt + "\n Trinnskatt å betale: "
							+ String.format("%.2f",
									(inntekt - trinn3) * pros3 + (trinn3 - trinn2) * pros2 + (trinn2 - trinn1) * pros1)
							+ " kr ");

		}

		else if (inntekt >= trinn4 && inntekt < trinn5) {
			showMessageDialog(null,
					"Trinn 4" + "\n Din inntekt: " + inntekt + "\n Trinnskatt å betale: "
							+ String.format("%.2f", (inntekt - trinn4) * pros4 + (trinn4 - trinn3) * pros3
									+ (trinn3 - trinn2) * pros2 + (trinn2 - trinn1) * pros1)
							+ " kr ");

		} else if (inntekt >= trinn5) {
			showMessageDialog(null,
					"Trinn 5" + "\n Din inntekt: " + inntekt + "\n Trinnskatt å betale: "
							+ String.format("%.2f", (inntekt - trinn5) * pros5 + (trinn5 - trinn4) * pros4
									+ (trinn4 - trinn3) * pros3 + (trinn3 - trinn2) * pros2 + (trinn2 - trinn1) * pros1)
							+ " kr ");

		} else {
			showMessageDialog(null, "Ugyldig inntekt");
		}

	}

}