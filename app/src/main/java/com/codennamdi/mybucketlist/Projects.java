package com.codennamdi.mybucketlist;

import androidx.annotation.DrawableRes;

public class Projects {
    String title;
    String description;
    int image;
    float rating;

    public Projects(String title, String description, @DrawableRes int image, float rating) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.rating = rating;
    }
}
