package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.embed.FullName;
@Entity
public class Teacher {
    @Id
    private int id;
    private FullName name;
    private String subject;
    private String address;

    public Teacher(int id, FullName name, String subject, String address) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.address = address;
    }

    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
