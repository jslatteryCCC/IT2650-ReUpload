package com.IT2650;

public class LogoCup extends Cup {

    private String logo;
    private String slogan;

    public LogoCup() {
        super();
        logo = "";
        slogan = "";
    }

    public LogoCup(int v, String c, String m, String lg, String s) {
        super(v,c,m );
        logo = lg;
        slogan = s;
    }

    public LogoCup(LogoCup other){
        super(other);
        slogan = other.slogan;
        logo = other.logo;
    }

    public String toString(){
        return super.toString() + " It features the " +
                getLogo() + " logo, and the slogan reads: " + getSlogan();
    }

    public void setLogo(String lg){
        this.logo = lg;
    }

    public void setSlogan(String s){
        this.slogan = s;
    }

    public String getLogo() {
        return logo;
    }

    public String getSlogan() {
        return slogan;
    }

    public boolean equals(Object other){
        if (other == null){
            return false;
        }
        else if(getClass() != other.getClass()){
            return false;
        }
        else{
            LogoCup otherLogoCup = (LogoCup)other;
            return super.equals(otherLogoCup) && logo.equals(otherLogoCup.logo) && slogan.equals(otherLogoCup.slogan);
        }
    }

}