/*
 Uppgift3.3
 Skapat 2019-09-27
 Rasmus Gillberg
*/

import javax.swing.*;
import java.util.Scanner;

public class Upp33 {
	public static void main(String[] args) {
		
		double pi = 3.1415;
		double radie;
		radie = Double.parseDouble (JOptionPane.showInputDialog(null, "Skriv cirkelns radie"));
		JOptionPane.showMessageDialog(null, radie*radie*pi);
		
		
	}
}