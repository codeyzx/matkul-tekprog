package subclass;

import superclass.Lover;

// MovieLover adalah concrete subclass dari Lover
public class MovieLover extends Lover {
    public MovieLover(String name) {
        super(name);
    }

    @Override
    public void preference() {
        System.out.println(getName() + " prefers to watch movie");
    }
}
