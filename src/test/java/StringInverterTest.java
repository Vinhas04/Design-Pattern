import org.Vinhas04.hero.StringDrink;
import org.Vinhas04.hero.StringInverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringInverterTest {
    @Test
    public void StringInverter() {
        StringDrink drink = new StringDrink("ABCD");
        StringInverter si = new StringInverter();
        si.execute(drink);
        assertEquals ("DCBA", drink.getText());
    }
}
