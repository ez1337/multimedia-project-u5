package com.carballeira.multimedia;

public class MultmediaModel {
    private String title;
    private String description;
    private int image;
    private MediaType type;

    public enum MediaType{
        Video,
        Audio,
        Web
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public MediaType getType() {
        return type;
    }

    public void setType(MediaType type) {
        this.type = type;
    }
}
