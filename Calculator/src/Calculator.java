import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Calculator {

	public static void main(String[] args) {
		
		int field1, field2, fieldAnswer;
		Frame window = new Frame("Calculator");
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		GridLayout g = new GridLayout(4,4);
		p2.setLayout(g);
		TextField T1, F1, F2, FA, OP;
		T1 = new TextField(36); T1.setText("");
		F1 = new TextField(36); F1.setText("");
		F2 = new TextField(36); F2.setText("");
		FA = new TextField(36); FA.setText("");
		OP = new TextField(36); OP.setText("");
		Button b0 = new Button("0");
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		Button badd = new Button("Addition +");
		Button bsub = new Button("Subtraction -");
		Button bmul = new Button("Multiplication *");
		Button bdiv = new Button("Division /");
		Button benter = new Button("ENTER");
		Button bc = new Button("C");
		Event0 E0 = new Event0(T1);
		Event1 E1 = new Event1(T1);
		Event2 E2 = new Event2(T1);
		Event3 E3 = new Event3(T1);
		Event4 E4 = new Event4(T1);
		Event5 E5 = new Event5(T1);
		Event6 E6 = new Event6(T1);
		Event7 E7 = new Event7(T1);
		Event8 E8 = new Event8(T1);
		Event9 E9 = new Event9(T1);
		EventAdd EAdd = new EventAdd(T1, F1, F2, FA, OP);
		EventC EC = new EventC(T1);
		EventDiv EDiv = new EventDiv(T1, F1, F2, FA, OP);
		EventE EE = new EventE(T1, F1, F2, FA, OP);
		EventMul EMul = new EventMul(T1, F1, F2, FA, OP);
		EventSub ESub = new EventSub(T1, F1, F2, FA, OP);
		b0.addActionListener(E0);
		b1.addActionListener(E1);
		b2.addActionListener(E2);
		b3.addActionListener(E3);
		b4.addActionListener(E4);
		b5.addActionListener(E5);
		b6.addActionListener(E6);
		b7.addActionListener(E7);
		b8.addActionListener(E8);
		b9.addActionListener(E9);
		badd.addActionListener(EAdd);
		bc.addActionListener(EC);
		bdiv.addActionListener(EDiv);
		benter.addActionListener(EE);
		bmul.addActionListener(EMul);
		bsub.addActionListener(ESub);
		window.add(p1,BorderLayout.NORTH);
		window.add(p2,BorderLayout.CENTER);
		p1.add(T1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(badd);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(bsub);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(bmul);
		p2.add(b0);
		p2.add(bc);
		p2.add(benter);
		p2.add(bdiv);
		window.setSize(400, 500);
		window.setVisible(true);
		
		
	}

}
