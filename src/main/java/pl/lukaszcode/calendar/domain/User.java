package pl.lukaszcode.calendar.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class User {
@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate createdNow;

    public User () {
    }

    public User(Long id, String firstName, String lastName, LocalDate createdNow) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdNow = createdNow;
    }


    public Long getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public LocalDate getCreatedNow() {
        return createdNow;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCreatedNow(LocalDate createdNow) {
        this.createdNow = createdNow;
    }
}
