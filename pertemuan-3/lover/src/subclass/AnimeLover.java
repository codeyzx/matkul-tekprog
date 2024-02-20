package subclass;

import superclass.Lover;

// AnimeLover adalah concrete subclass dari Lover
public class AnimeLover extends Lover {
    public AnimeLover(String name) {
        super(name);
    }

    @Override
    public void preference() {
        System.out.println(getName() + " prefers to watch anime");
    }

}
