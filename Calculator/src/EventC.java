import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventC implements ActionListener {
	TextField box1;
	public EventC(TextField A) {
		box1 = A;
	}
	public void actionPerformed(ActionEvent T) {
		int A;
		A=0;
		box1.setText(Integer.toString(A));
	}
}
