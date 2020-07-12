/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnoGame2020;

import java.util.Random;

/**
 *
 * @author QQ
 */
public class unoCard extends Card{
    Random r = new Random();
    enum Color {

Red, Blue, Green, Yellow, Wild;

private static final Color[] colors = Color.values();

public static Color getColor(int i) {

return Color.colors[i];

}

}

    enum Value

{

Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, DrawTwo, Skip, Reverse, Wild, Wild_Four;

private static final Value[] values = Value.values();

public static Value getValue(int i){

return Value.values[i];
}

}
 public int randomValue() {
        int v = r.nextInt(15) + 1;
        return v;
    }
 public int randomSuit() {
        int s = r.nextInt(5);
        return s;
    } 
    
    
@Override
public String toString(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
