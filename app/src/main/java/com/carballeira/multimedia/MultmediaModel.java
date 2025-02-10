package com.carballeira.multimedia;

public class MultmediaModel {
    private String title;
    private String description;
    private int image;
    private int uri;
    private String url;
    private MediaType type;

    public MultmediaModel(String title, String description, int image, int uri, MediaType type) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.uri = uri;
        this.type = type;
    }

    public MultmediaModel(String title, String description, int image, String url, MediaType type) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.url = url;
        this.type = type;
    }

    public enum MediaType{
        VIDEO,
        AUDIO,
        WEB
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
