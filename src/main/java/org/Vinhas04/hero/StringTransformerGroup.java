package org.Vinhas04.hero;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> transformers;
    public StringTransformerGroup(List<StringTransformer> transformers){
        this.transformers=transformers;
    }
    public void execute(StringDrink drink) {
        for (StringTransformer transformer : transformers) {
            transformer.execute(drink);

        }
    }
}
