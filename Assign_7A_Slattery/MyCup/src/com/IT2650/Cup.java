package com.IT2650;

public class Cup {

    private int volume;
    private String color;
    private String material;

    public Cup() {
        volume = 8;
        color = "white";
        material = "ceramic";
    }

    public Cup(int v, String c, String m) {
        volume = v;
        color = c;
        material = m;
    }
    public Cup(Cup other){
        volume = other.volume;
        color = other.color;
        material = other.material;
    }

    public String toString(){
        return "This is a(n) " + volume + "oz. " + color + " cup made of " + material + ".";
    }

    public void set(int v, String c, String m) {
        volume = v;
        color = c;
        material = m;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getVolume() { return volume; }

    public String getColor() {return color; }

    public String getMaterial() { return material; }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (getClass() != other.getClass()) {
            return false;
        } else {
            Cup otherCup = (Cup)other;
            return (volume == otherCup.volume) && color.equals(otherCup.color) && material.equals(otherCup.material);
        }
    }
}
