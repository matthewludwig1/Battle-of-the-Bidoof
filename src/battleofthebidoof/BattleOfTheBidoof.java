/*
    Matt Ludwig
    2019-04-04
    Summative for Unit 3: Modular Programming
 */
package battleofthebidoof;

/**
 *
 * @author malud0519
 */
import javax.swing.*;
import java.io.*;
public class BattleOfTheBidoof {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TO DO: Provide the user with an introduction to the simulator
        // Next, ask the user for the name of the Bidoof
        // Create two bidoof
        // Display the levels of the two bidoof
        // Ask the user for the prediction of the battle outcome
        // Simulate the battle using the move tackle
        
        JOptionPane.showMessageDialog(null, "Bidoof Simulator"+ "\n"+ "This program will simulate a pokemon battle between two"
                + " Bidoof's" + "\n" + "Press OK to begin: ");
        String nm1, nm2;
        // User's Pokemon
        nm1 = JOptionPane.showInputDialog("Instructions:" + "\n" + "Two Bidoof's with random levels, natures, and attributes will be "
                + "generated." + "\n" + "Enter the name of your Bidoof: ");
        if (nm1.isEmpty()) {
            nm1 = "Bidoof1";
        }
        Bidoof bidoof1 = new Bidoof(nm1); // creates the first bidoof
        
        nm2 = JOptionPane.showInputDialog("Enter the name of the CPU's Bidoof: ");
        if (nm2.isEmpty()) {
            nm2 = "Bidoof2";
        }
        Bidoof bidoof2 = new Bidoof(nm2);
                
        
    }
    
}
