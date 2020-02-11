/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author megha, 2020
 *@modifier mukti  
 *
 */
public abstract class Card 
{
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
        private Suits suit ;
    private Value value ;

    public Card(Suits suits, Value value) {
        this.suit = suits;
        this.value = value;
    }

    @Override
    public String toString() {
       return getSuit()+", "+getValue();
    }

    public enum Suits {
        Red, Blue, Yellow, Green
    };


    public enum Value {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE
    };

    public Value getValue() {
        return this.value;
    }

    public Suits getSuit() {
        return this.suit;
    }
    //@Override
   // public abstract String toString();
    
}
