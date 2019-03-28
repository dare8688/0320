package com.example.a0320;

public class ItemData {
    private String title;
    private int imageSmall;
    private int imageLarge;

    public ItemData(String title, int imageSmall, int imageLarge){
        this.title = title;
        this.imageSmall = imageSmall;
        this.imageLarge = imageLarge;
    }

    public String getTitle(){
        return title;
    }

    public int getImageLarge(){
        return imageLarge;
    }

    public int getImageSmall() { return imageSmall; }
}
