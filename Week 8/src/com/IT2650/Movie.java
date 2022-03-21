package com.IT2650;
/**/

public abstract class Movie {
    private String title;
    private String ratingMPAA;
    private String idNumber;

    public Movie(){
        title = "";
        ratingMPAA = "";
        idNumber = "";
    }

    public Movie(String t,String r, String i){
        title = t;
        ratingMPAA = r;
        idNumber = i;
    }

    public Movie(Movie other){
        title = other.title;
        ratingMPAA = other.ratingMPAA;
        idNumber = other.idNumber;
    }

    public String getTitle() { return title; }

    public String getRatingMPAA() {
        return ratingMPAA;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRatingMPAA(String ratingMPAA) {
        this.ratingMPAA = ratingMPAA;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", ratingMPAA='" + ratingMPAA + '\'' +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        return idNumber.equals(movie.idNumber);
    }

    public abstract double calcLateFees(int days);
}
