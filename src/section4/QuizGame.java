package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String input=JOptionPane.showInputDialog("Who gave America the Statue of Liberty?");
		// 3.  Use an if statement to check if their answer is correct
		if(input.equals("france")) {
			JOptionPane.showMessageDialog(null, "Nice Job!" );
		// 4.  if the user's answer was correct, add one to their score 
		score=score+1;
		JOptionPane.showMessageDialog(null, "Score:"+ score);
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String input1=JOptionPane.showInputDialog("What is my pet cactuses name?");
		// 6.  After all the questions have been asked, print the user's score 
		if(input1.equals("wheaton")) {
			JOptionPane.showMessageDialog(null, "Nice Job!" );
			score=score+1;
			JOptionPane.showMessageDialog(null, "Score:"+ score);
	}
}}
