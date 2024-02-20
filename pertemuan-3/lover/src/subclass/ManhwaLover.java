package subclass;

import superclass.Lover;

// ManhwaLover adalah concrete subclass dari Lover
public class ManhwaLover extends Lover {
    public ManhwaLover(String name) {
        super(name);
    }

    @Override
    public void preference() {
        System.out.println(getName() + " prefers to read manhwa");
    }

    public void readManhwa() {
        System.out.println(getName() + " is reading manhwa");
    }
}
