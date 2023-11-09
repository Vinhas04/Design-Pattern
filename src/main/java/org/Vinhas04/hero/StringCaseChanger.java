package org.Vinhas04.hero;

public class StringCaseChanger implements StringTransformer{
    public void execute(StringDrink drink){
        String str_drink=drink.getText();
        String result="";
        for ( int i = 0; i<drink.getText().length();i++){
            char tmp = str_drink.charAt(i);
            if(Character.isLowerCase(tmp)){
                tmp=Character.toUpperCase(tmp);

            }
            else{
                tmp=Character.toLowerCase(tmp);
            }

            result+=tmp;
        }
        drink.setText(result);
    }


}
