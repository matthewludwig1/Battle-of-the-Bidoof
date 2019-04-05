/*
    Matt Ludwig
    2019-04-05
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
        // TO DO: Provide the user with an introduction to the simulator
        // Next, ask the user for the name of the Bidoof
        // Create two bidoof
        // Display the levels of the two bidoof
        // Ask the user for the prediction of the battle outcome
        // Simulate the battle using the move tackle
        // Display which pokemon moves first, next display the amount of health remaining
        // Write each turn of the battle to battle.txt
        
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
        Bidoof bidoof2 = new Bidoof(nm2); // creates the second bidoof
        
        JOptionPane.showMessageDialog(null, "User's Pokemon:                    CPU's Pokemon: " + "\n" + "Name: " + bidoof1.getName()+ 
                "                         Name: " + bidoof2.getName() + "\n" + "Species: " + "Bidoof                       Species: Bidoof" 
                + "\n" + "Type: " + "Normal                            Type: Normal" + "\n" + "Level: " + bidoof1.getLevel() 
                +"                                    Level: "+ bidoof2.getLevel() + "\n" + "HP: " + bidoof1.getHP() + 
                "                                      HP: Unknown" + "\n" + "Attack: " + bidoof1.getAttack() + "                               Attack: Unknown" 
                + "\n" + "Defense: " + bidoof1.getDefense() + "                            Defense: Unknown" + "\n" + "Speed: " 
                + bidoof1.getSpeed() + "                               Speed: " + bidoof2.getSpeed());
     
        int rounds = Integer.parseInt(JOptionPane.showInputDialog(bidoof2.getName() + " is challenging " + bidoof1.getName() + 
             " to a battle!" + "\n" + "How many turns will the battle last?"));
        
        for (int i = 0; i < rounds; i++) {
            if (bidoof1.getSpeed() >= bidoof2.getSpeed()) {
                // insert the method for the move tackle, or bidoof1.tackle();
                // print the round number to the file
                // print the remaining hp for bidoof2
            }
            else if (bidoof2.getSpeed() > bidoof1.getSpeed()) {
                 // insert the method for the move tackle, or bidoof2.tackle();
                // print the round number to the file
                // print the remaining hp for bidoof1
            }
        }
                
        
    }
    
}
