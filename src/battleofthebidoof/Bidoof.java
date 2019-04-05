/*
   Matt Ludwig
   2019-04-04
   This is the class for the Pokemon Bidoof
 */
package battleofthebidoof;
/**
 *
 * @author malud0519
 */
public class Bidoof {
    // Stat Variables
    private int level, hP, attack, defense, speed;
    private String pokName;
    
    // Constructors
    public Bidoof() { // default 
        level = 50;
        hP = 119;
        attack = 45;
        defense = 40;
        speed = 32;
    }
    
    public Bidoof(int lev, int HP, int att, int def, int spd, String pkNm) {
        lev = (int) (Math.random()* (100 - 50) + 50 );   // random attributes
        level = lev;
        HP = (int) (Math.random() * (322-119)) + 119;
        hP = HP;
        att = (int) (Math.random() * (207 - 45)) + 45;
        attack = att;
        def = (int) (Math.random() * (196 - 40)) + 40;
        defense = def;
        spd = (int) (Math.random() * (177 - 32)) + 32;
        speed = spd;
        pokName = pkNm;
    }
    // alternate
    public Bidoof(String pkNm) {
        pokName = pkNm;
        level = (int) (Math.random()* (100 - 50) + 50 );
        hP = (int) (Math.random() * (322-119)) + 119;
        attack = (int) (Math.random() * (207 - 45)) + 45;
        defense = (int) (Math.random() * (196 - 40)) + 40;
        speed = (int) (Math.random() * (177 - 32)) + 32;
    }
    
    public void setLevel(int lev) {
        level = lev;
    }
    public int getLevel() {
        return level;
    }
    
    public void setHitPoints(int HP) {
        hP = HP;
    }
    public int getHP() {
        return hP;
    }
    
    public void setAttack(int att) {
        attack = att;
    }
    public int getAttack() {
        return attack;
    }
    
    public void setDefense(int def) {
        defense = def;
    }
    public int getDefense() {
        return defense;
    }
    
    public void setSpeed(int spd) {
        speed = spd;
    }
    public int getSpeed() {
        return speed;
    }
    
    public void setName(String pkNm) {
        pokName = pkNm;
    }
    public String getName() {
        return pokName;
    }
    
}
