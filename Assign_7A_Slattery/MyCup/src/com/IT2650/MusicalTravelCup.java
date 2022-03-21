package com.IT2650;

public class MusicalTravelCup extends TravelCup{

    private String song;
//all MusicalTravelCups play songs

    public MusicalTravelCup() {
        super();
        song = "";
    }
    public MusicalTravelCup(int v, String c, String m, String lg, String s, boolean h, String sg) {
        super(v,c,m,lg,s,h);
        song = sg;
    }

    public MusicalTravelCup(MusicalTravelCup other){
        super(other);
        song = other.song;
    }

    public String toString() {
        return super.toString() + " If you push the button on this cup, it plays the song '" +  song + "'.";
    }

    public String getSong() {
        return song;
    }

    public void setSong(String sg){
        song = sg;
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (getClass() != other.getClass()) {
            return false;
        } else {
            MusicalTravelCup otherMusicalTravelCup = (MusicalTravelCup) other;
            return super.equals(other) && this.song == ((MusicalTravelCup) other).song;
        }
    }
}
