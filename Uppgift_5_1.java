package Uppgift_5_1;

import javax.swing.JOptionPane;

//Uppgift 5.1 sida 121
public class Uppgift_5_1 {

	public static void main(String[] args) {

		int maxNumber = Integer.MIN_VALUE;
		int minNumber = Integer.MAX_VALUE;

		while (true) {
			String numbers = JOptionPane.showInputDialog("Skriv in tal.");
			if (numbers == null)
				break;
			int number = Integer.parseInt(numbers);
			maxNumber = Math.max(number, maxNumber);
			minNumber = Math.min(number, minNumber);

		}

		JOptionPane.showMessageDialog(null, "Största nummer: " + maxNumber + "\nMinsta nummer: " + minNumber);

	}

}
