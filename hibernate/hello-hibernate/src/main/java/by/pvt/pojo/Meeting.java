package by.pvt.pojo;

import jdk.jshell.Snippet;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

public class Meeting {

    private long id;
    private String subject;
    private Employee organiser;
    private Set attendies;
    private Date dateTime;
    private Status status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Employee getOrganiser() {
        return organiser;
    }

    public void setOrganiser(Employee organiser) {
        this.organiser = organiser;
    }

    public Set getAttendies() {
        return attendies;
    }

    public void setAttendies(Set attendies) {
        this.attendies = attendies;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
