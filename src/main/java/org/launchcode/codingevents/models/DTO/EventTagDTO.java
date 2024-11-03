package org.launchcode.codingevents.models.DTO;

import jakarta.validation.constraints.NotNull;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.Tag;

public class EventTagDTO {


    private Event events;


    private Tag tag;

    public EventTagDTO() {}

    public Event getEvents() {
        return events;
    }

    public void setEvents(Event events) {
        this.events = events;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
