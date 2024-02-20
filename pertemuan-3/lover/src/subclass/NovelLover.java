package subclass;

import superclass.Lover;

// NovelLover adalah concrete subclass dari Lover
public class NovelLover extends Lover {
    public NovelLover(String name) {
        super(name);
    }

    @Override
    public void preference() {
        System.out.println(getName() + " prefers to read novel");
    }
}
