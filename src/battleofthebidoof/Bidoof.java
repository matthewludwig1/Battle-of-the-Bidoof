/*
   Matt Ludwig
   2019-04-09
   This class holds the Bidoof object, which contains all of a bidoof's attributes
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
    /**
     * 
     * @param lev
     * @param HP
     * @param att
     * @param def
     * @param spd
     * @param pkNm 
     * this constructs random attributes for each Bidoof object
     */
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
    /**
     * 
     * @param lev 
     * This sets the level
     */
    public void setLevel(int lev) {
        level = lev;
    }
    /**
     * 
     * @return level
     * this method accesses the level of each bidoof
     */
    public int getLevel() {
        return level;
    }
    /**
     * 
     * @param HP 
     * this sets the value hit points
     */
    public void setHitPoints(int HP) {
        hP = HP;
    }
    /**
     * 
     * @return hP
     * this method returns the hit point value
     */
    public int getHP() {
        return hP;
    }
    /**
     * 
     * @param att 
     * this sets the attack stat
     */
    public void setAttack(int att) {
        attack = att;
    }
    /**
     * 
     * @return attack
     * this returns the value of the attack statistic
     */
    public int getAttack() {
        return attack;
    }
    /**
     * 
     * @param def 
     * this sets the defense statistic
     */
    public void setDefense(int def) {
        defense = def;
    }
    /**
     * 
     * @return defense
     * this gets the value of the defense statistic
     */
    public int getDefense() {
        return defense;
    }
    /**
     * 
     * @param spd 
     * this sets the speed statistic
     */
    public void setSpeed(int spd) {
        speed = spd;
    }
    /**
     * 
     * @return speed
     * this returns the value of the speed statistic
     */
    public int getSpeed() {
        return speed;
    }
    /**
     * 
     * @param pkNm 
     * this sets the name of each bidoof
     */
    public void setName(String pkNm) {
        pokName = pkNm;
    }
    /**
     * 
     * @return pokName
     * this accesses the String value of the name
     */
    public String getName() {
        return pokName;
    }
    
}
