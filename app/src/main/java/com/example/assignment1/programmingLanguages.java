package com.example.assignment1;



public class programmingLanguages {
    String languageName,item_description;
    int image;


    public programmingLanguages(String languageName, String item_description, int image) {
        this.languageName = languageName;
        this.item_description = item_description;
        this.image = image;
    }

    public String getLanguageName() {
        return languageName;
    }

    public String getItem_description() {
        return item_description;
    }

    public int getImage() {
        return image;
    }
}
