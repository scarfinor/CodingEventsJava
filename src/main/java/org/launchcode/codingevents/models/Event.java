package org.launchcode.codingevents.models;

public class Event {
    private String name;
    private String description;
    private String imageUrl;

    public Event(String name, String description, String imageUrl) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}