package com.dualagenda.model;

import java.time.LocalDateTime;

public class Event {

    private String title;
    private String description;
    private LocalDateTime dateTime;
    private String category; // e.g. "school", "work", "personal"

    public Event() {
    }

    public Event(String title, String description, LocalDateTime dateTime, String category) {
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
        this.category = category;
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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateTime=" + dateTime +
                ", category='" + category + '\'' +
                '}';
    }
}