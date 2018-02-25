import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operators implements ActionListener {

		TextField T;
		int FIRSTNO;
		String OPT;
		
		Operators(TextField A) {
			T = A;
		}
		
		public void actionPerformed(ActionEvent EE) {
			Button BTN = (Button) EE.getSource();
			String L = BTN.getLabel();
			if (L.equals("C")) {
				T.setText(""); 
				}
				else if (L.equals("=")) {
					int A, B = 0;
					A = Integer.parseInt(T.getText());
							if (OPT.equals("+")) {B = FIRSTNO + A;}
							if (OPT.equals("-")) {B = FIRSTNO - A;}
							if (OPT.equals("*")) {B = FIRSTNO * A;}
							if (OPT.equals("/")) {B = FIRSTNO / A;}
							T.setText(Integer.toString(B));
				}
				else {
					FIRSTNO = Integer.parseInt(T.getText());
					OPT = L;
					T.setText("");
			}
		}
}
