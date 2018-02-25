import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDiv implements ActionListener {
	TextField box1;
	TextField boxEntry1;
	TextField boxEntry2;
	TextField boxAnswer;
	TextField boxOperator;
	public EventDiv(TextField A, TextField F1, TextField F2, TextField FA, TextField Operator) {
		box1 = A;
		boxEntry1 = F1;
		boxEntry2 = F2;
		boxAnswer = FA;
	}
	public void actionPerformed(ActionEvent T) {
		
		if( boxEntry1.getText() == null) {
					boxEntry1.setText(box1.getText());
					box1.setText(null);
		} else {
					boxEntry2.setText(box1.getText());
					box1.setText(null);
		}
	}
}