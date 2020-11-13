package com.example.planetdescription;

public class Planet {
    private String name;
    private String info;
    private int imageID;

    public Planet(String name, String info, int imageID) {
        this.name = name;
        this.info = info;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getImageID() {
        return imageID;
    }
}
