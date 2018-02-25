import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class SyafeeqsCalc {

	public static void main(String[] args) {
		
		TextField screen;
		screen = new TextField(36); screen.setText("");
		
		Frame F1 = new Frame("Calculator");
		Panel P1 = new Panel();
		Panel P2 = new Panel();
		GridLayout g = new GridLayout(4,4);
		P2.setLayout(g);
		Operators O = new Operators(screen);
		EventHandler E = new EventHandler(screen);

		F1.add(P1,BorderLayout.NORTH);
		F1.add(P2,BorderLayout.CENTER);
		

		Button B0 = new Button("0");
		Button B1 = new Button("1");
		Button B2 = new Button("2");
		Button B3 = new Button("3");
		Button B4 = new Button("4");
		Button B5 = new Button("5");
		Button B6 = new Button("6");
		Button B7 = new Button("7");
		Button B8 = new Button("8");
		Button B9 = new Button("9");
		Button BADD = new Button("+");
		Button BSUB = new Button("-");
		Button BMUL = new Button("*");
		Button BDIV = new Button("/");
		Button BEQUALS = new Button("=");
		Button BCLEAR = new Button("C");
		
		B0.addActionListener(E);
		B1.addActionListener(E);
		B2.addActionListener(E);
		B3.addActionListener(E);
		B4.addActionListener(E);
		B5.addActionListener(E);
		B6.addActionListener(E);
		B7.addActionListener(E);
		B8.addActionListener(E);
		B9.addActionListener(E);
		BADD.addActionListener(O);
		BSUB.addActionListener(O);
		BDIV.addActionListener(O);
		BMUL.addActionListener(O);
		BCLEAR.addActionListener(O);
		BEQUALS.addActionListener(O);
		
		P1.add(screen);
		P2.add(B1);
		P2.add(B2);
		P2.add(B3);
		P2.add(BADD);
		P2.add(B4);
		P2.add(B5);
		P2.add(B6);
		P2.add(BSUB);
		P2.add(B7);
		P2.add(B8);
		P2.add(B9);
		P2.add(BMUL);
		P2.add(B0);
		P2.add(BCLEAR);
		P2.add(BEQUALS);
		P2.add(BDIV);
		
		F1.setSize(400, 500);
		F1.setVisible(true);
	}
	
}
