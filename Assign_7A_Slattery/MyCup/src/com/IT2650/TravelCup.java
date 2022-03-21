package com.IT2650;

//Class Invariant: Every TravelCup has a lid.

public class TravelCup extends LogoCup{

    private boolean handle;

    public TravelCup() {
        super();
        handle = false;
    }

    public TravelCup(int v, String c, String m, String lg, String s, boolean h) {
        super(v,c,m,lg,s);
        handle = h;
    }

    public TravelCup(TravelCup other){
        super(other);
        handle = other.handle;
    }

    public String toString(){
        String hasHandle = "";
        if (handle == true){
            hasHandle = "This TravelCup even has a handle!";
        }
        return super.toString() + "\nEvery travel cup has a lid. " + hasHandle;
    }
    public void setHandle(boolean h){
        this.handle = h;
    }
    public boolean getHandle(){
        return handle;
    }
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (getClass() != other.getClass()) {
            return false;
        } else {
            TravelCup otherTravelCup = (TravelCup)other;
            return super.equals(other) && this.handle == ((TravelCup) other).handle;
        }
    }
}
