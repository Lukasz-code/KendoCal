package pl.lukaszcode.calendar.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="CALENDAR")
public class Calendar {

    @Id
    @NotNull
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="CALLENDAR_ID", unique = true)
    private Long callendarId;

    @Column(name="EXERCISE_DATE")
    private Timestamp date;

    public Calendar() {}

    public Calendar(Long callendarId, Timestamp date) {
        this.callendarId = callendarId;
        this.date = date;
    }

    public Long getCallendarId() {
        return callendarId;
    }

    public void setCallendarId(Long callendarId) {
        this.callendarId = callendarId;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}

