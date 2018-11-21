package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		int score = 0;
		String answer = new String();
		String Guess = new String();
		answer = "Nothing";
		Guess = JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die?");
		if(Guess.equals(answer)) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer is " + answer + "!"); 
		}
		JOptionPane.showMessageDialog(null, score);
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
	
	}
}

