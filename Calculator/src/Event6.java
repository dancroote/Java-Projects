import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event6 implements ActionListener {
	TextField box1;
	public Event6(TextField A) {
		box1 = A;
	}
	public void actionPerformed(ActionEvent T) {
		int A;
		A=6;
		box1.setText(Integer.toString(A));
	}
}
