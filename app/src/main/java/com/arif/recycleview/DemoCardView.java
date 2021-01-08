package com.arif.recycleview;

public class DemoCardView {

    private String moviename;
    private String derectorname;
    private int photo;

    public DemoCardView() {
    }

    public DemoCardView(String moviename, String derectorname, int photo) {
        this.moviename = moviename;
        this.derectorname = derectorname;
        this.photo = photo;
    }

    public String getMoviename() {
        return moviename;
    }

    public String getDerectorname() {
        return derectorname;
    }

    public int getPhoto() {
        return photo;
    }
}
