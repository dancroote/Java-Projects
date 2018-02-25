import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event9 implements ActionListener {
	TextField box1;
	public Event9(TextField A) {
		box1 = A;
	}
	public void actionPerformed(ActionEvent T) {
		int A;
		A=9;
		box1.setText(Integer.toString(A));
	}
}
