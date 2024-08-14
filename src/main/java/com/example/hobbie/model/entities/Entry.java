package com.example.hobbie.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "entries")
public class Entry extends BaseEntity {

    private String date;
    private Abo abo;
    private boolean isInProcess;

    public Entry() {
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Abo getAbo() {
        return abo;
    }

    public void setAbo(Abo abo) {
        this.abo = abo;
    }

    @Column
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isInProcess() {
        return isInProcess;
    }

    public void setInProcess(boolean inProcess) {
        isInProcess = inProcess;
    }
}
