package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("Hello World");
	JOptionPane.showMessageDialog(null,"April Fools ;)");
	String input=JOptionPane.showInputDialog("What day is it today?");
	JOptionPane.showMessageDialog(null,input);
}
}
