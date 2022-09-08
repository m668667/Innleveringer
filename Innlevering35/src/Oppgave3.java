import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Oppgave3 {

	public static void main(String[] args) {
		
		int n = parseInt (showInputDialog("Gi verdi n:") );
		
		if (n > 0) {
			
			int svar = 1;
			
			for (int i = 1; i <= n; i++) {
				svar = svar*i;
				
			}
			
			showMessageDialog(null, "Verdi: " + svar);
			
		}
			

	}

}
