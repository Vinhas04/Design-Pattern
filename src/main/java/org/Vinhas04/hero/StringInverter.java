package org.Vinhas04.hero;

public class StringInverter implements StringTransformer{
    public void execute(StringDrink drink){
        StringBuilder str = new StringBuilder(drink.getText());
        StringBuilder reverseStr = str.reverse();
        drink.setText(String.valueOf(reverseStr));


    }
}
