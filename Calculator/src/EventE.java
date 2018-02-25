import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventE implements ActionListener {
	TextField box1;
	TextField boxEntry1;
	TextField boxEntry2;
	TextField boxAnswer;
	TextField boxOperator;
	
	public EventE(TextField A, TextField F1, TextField F2, TextField FA, TextField Operator) {
		box1 = A;
		boxEntry1 = F1;
		boxEntry2 = F2;
		boxAnswer = FA;
		boxOperator = Operator;
	}
	public void actionPerformed(ActionEvent T) {
		
		if( boxEntry1.getText() != null && boxEntry2.getText() != null ) {
			int ANS;
			ANS = 0;
					ANS = (Integer.parseInt(boxEntry1.getText()))*(Integer.parseInt(boxEntry2.getText()));
					boxAnswer.setText(String.valueOf(ANS));
		}
	}
}