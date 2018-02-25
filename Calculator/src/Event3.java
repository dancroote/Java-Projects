import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event3 implements ActionListener {
	TextField box1;
	public Event3(TextField A) {
		box1 = A;
	}
	public void actionPerformed(ActionEvent T) {
		int A;
		A=3;
		box1.setText(Integer.toString(A));
	}
}
