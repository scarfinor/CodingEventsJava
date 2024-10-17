package org.launchcode.codingevents.models;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Event name is required!")
    @Size(min = 3, max = 50, message = "Event name must be between 3 and 50 characters!")
    private String name;

    @Size(max = 500, message = "Event description too long!")
    private String description;

    @NotBlank(message = "Email is required1!")
    @Email(message = "Invalid email. Try again!")
    private String contactEmail;

    @NotBlank(message = "Event Address is required!")
    private String address;

    public @AssertTrue Boolean getAttendance() {
        return attendance;
    }

    @AssertTrue(message = "Event attendance is mandatory!")
    private Boolean attendance = true;

    @Positive(message="Number of attendees must be one or more!")
    private int numberOfAttendees;

    @FutureOrPresent(message = "Event date cannot be in the past!")
    private LocalDate eventDate;


    public Event(String name, String description, String contactEmail, String address, boolean attendance, int numberOfAttendees, LocalDate eventDate) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.address = address;
        this.attendance = attendance;
        this.numberOfAttendees = numberOfAttendees;
        this.eventDate = eventDate;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public @NotBlank(message = "Event Address is required") String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "Event Address is required") String address) {
        this.address = address;
    }

    @Positive(message = "Number of attendees must be one or more.")
    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(@Positive(message = "Number of attendees must be one or more.") int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public @FutureOrPresent(message = "Event date cannot be in the past!") LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(@FutureOrPresent(message = "Event date cannot be in the past!") LocalDate eventDate) {
        this.eventDate = eventDate;
    }
}
