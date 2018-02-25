import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventAdd implements ActionListener {
	TextField box1;
	TextField boxEntry1;
	TextField boxEntry2;
	TextField boxAnswer;
	TextField currentOP;
	public EventAdd(TextField A, TextField F1, TextField F2, TextField FA, TextField Operator) {
		box1 = A;
		boxEntry1 = F1;
		boxEntry2 = F2;
		boxAnswer = FA;
		currentOP = Operator;
	}
public void actionPerformed(ActionEvent T) {
	
		if(boxEntry2.getText() != "") {
		box1.setText(String.valueOf((Integer.parseInt(boxEntry1.getText()))+(Integer.parseInt(boxEntry2.getText()))));
		boxAnswer.setText(String.valueOf((Integer.parseInt(boxEntry1.getText()))+(Integer.parseInt(boxEntry2.getText()))));
		}
		if(boxEntry1.getText() == "") {
					boxEntry1.setText(box1.getText());
					currentOP.setText("ADD");
					System.out.println(boxEntry1.getText());
					System.out.println(currentOP.getText());
			System.out.println("HERRO");
		} else {
					boxEntry2.setText(box1.getText());
					box1.setText("");
					box1.setText(String.valueOf((Integer.parseInt(boxEntry1.getText()))+(Integer.parseInt(boxEntry2.getText()))));
		}
	}
}