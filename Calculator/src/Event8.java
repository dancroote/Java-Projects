import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event8 implements ActionListener {
	TextField box1;
	public Event8(TextField A) {
		box1 = A;
	}
	public void actionPerformed(ActionEvent T) {
		int A;
		A=8;
		box1.setText(Integer.toString(A));
	}
}
