/*
    Matt Ludwig
    2019-04-09
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
    public static void main(String[] args) throws IOException{
    
       try {
       BufferedReader readFile = new BufferedReader(new FileReader("battle.txt"));  // reads previous battle data
       System.out.println(readFile.readLine());
       String line = "";
           while((line = readFile.readLine()) != null){ //EOF
           System.out.println(line);
        }
        readFile.close();
        PrintWriter fileOut = new PrintWriter(new FileWriter( 
                "battle.txt", true));
        int damage;
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
            nm2 = "Bidoof2";  // default name
        }
        Bidoof bidoof2 = new Bidoof(nm2); // creates the second bidoof
        
        // displays pokemon data
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
            int round = i + 1;
            fileOut.println();
            fileOut.append("Round " + round + ":");
            fileOut.println();
            if (bidoof1.getHP() <=0) {
                fileOut.append(bidoof1.getName() + " fainted. " + bidoof2.getName() + " is victorious");
                break; // ends battle
            }
            if (bidoof2.getHP() <= 0) {
                fileOut.append(bidoof2.getName() + " fainted. " + bidoof1.getName() + " is victorious");
                break;
            }
            if (bidoof1.getSpeed() >= bidoof2.getSpeed()) { // if the user's Pokemon is faster
                
                damage = (int)((((2*bidoof1.getLevel())/5)+ 2)* 50)*(((bidoof1.getAttack() / bidoof2.getDefense()))/50) + 2; // damage formula
                bidoof2.setHitPoints(bidoof2.getHP() - (int)(damage * 1.5));
                fileOut.append(bidoof1.getName() + " has " + bidoof1.getHP() + " HP. " + bidoof2.getName() + " has " + bidoof2.getHP() + " HP ");
                fileOut.println();
                fileOut.append(bidoof1.getName() + " uses tackle... " + " this deals " + damage + " damage to " + bidoof2.getName());
                fileOut.println();
                damage = (int)((((2*bidoof2.getLevel())/5)+ 2)* 50)*(((bidoof2.getAttack() / bidoof1.getDefense()))/50) + 2;  
                bidoof1.setHitPoints(bidoof1.getHP() - (int)(damage * 1.5));
                fileOut.append(bidoof1.getName() + " has " + bidoof1.getHP() + " HP. " + bidoof2.getName() + " has " + bidoof2.getHP() + " HP ");
                fileOut.println();
                fileOut.append(bidoof2.getName() + " uses tackle... " + " this deals " + damage + " damage to " + bidoof1.getName());
            }
            else if (bidoof2.getSpeed() > bidoof1.getSpeed()) { // if the CPU's Pokemon is faster
                
                damage = (int)((((2*bidoof2.getLevel())/5)+ 2)* 50)*(((bidoof2.getAttack() / bidoof1.getDefense()))/50) + 2;
                bidoof1.setHitPoints(bidoof1.getHP() - (int)(damage * 1.5));
                fileOut.append(bidoof1.getName() + " has " + bidoof1.getHP() + " HP. " + bidoof2.getName() + " has " + bidoof2.getHP() + " HP ");
                fileOut.println();
                fileOut.append(bidoof2.getName() + " uses tackle... " + " this deals " + damage + " damage to " + bidoof1.getName());
                fileOut.println();
                damage = (int)((((2*bidoof1.getLevel())/5)+ 2)* 50)*(((bidoof1.getAttack() / bidoof2.getDefense()))/50) + 2; // damage formula
                bidoof2.setHitPoints(bidoof2.getHP() - (int)(damage * 1.5));
                fileOut.append(bidoof1.getName() + " has " + bidoof1.getHP() + " HP. " + bidoof2.getName() + " has " + bidoof2.getHP() + " HP ");
                fileOut.println();
                fileOut.append(bidoof1.getName() + " uses tackle... " + " this deals " + damage + " damage to " + bidoof2.getName());
                
            }
        }
        
        fileOut.close(); //EOF
    
       }
       catch (FileNotFoundException fileNotFound) {
           System.out.println(fileNotFound);
       }
       catch (NumberFormatException nfe) {
           System.out.println(nfe + " Please select an integer");
       }
       catch (NullPointerException npe) {
           System.out.println(npe + " Program terminated");
       }
       
    }
    
}
