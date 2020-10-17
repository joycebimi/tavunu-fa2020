
/**
 * A tavunu is an imaginary Earth-dwelling being.
 *
 * A tavunu looks a bit like a Patagonian Mara and lives in a non-gendered but
 * hierarchical society. Most interactions among tavuni are negotiated with
 * pava -- items of status used for bargaining.
 *
 * @author Mithat Konar
 * @author Your Name
 */

public class Tavunu {
    String name;
    int pava
    int birthYear;     
    public Tavunu(string name, int birthYear, int pava){
         this.name = name;
         this.pava = pava;
         this.birthYear = birthYear;
    }
    
     public boolean setName(String name) {
        if (name.charAt(0) != 'T' && name.charAt(0) != 'D') {
            return false;
        } else {
            this.name = name;
            return true;

        }
    public String getName(){
        return name;
    }
        
    public boolean spendPava(int amount) {
        
        if (pava <= 0) {
         return false;
        } else {
            pava-=amount;
            return true;

        }
    }
    public static boolean receivePava() {
        if (pava <= 0) {
         return false;
        } else {
            pava +=amount
            return true;

        }
    }
    public int getPava(){
        return pava;
    }
    public int getbirthYear(){
        return birthYear;
    }
    public void setbirthYear(){
        this.birthYear = birthYear;
    }
    public String toString(){
        String stringRepresentation = name + "born in "  + String.valueOf(birthYear) + " has " + String.valueOf(pava) + " pava.";

        return stringRepresentation;
    }    
    
}/* See readme.md for what to do. */
}
