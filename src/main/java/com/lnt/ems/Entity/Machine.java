package com.lnt.ems.Entity;

import javax.persistence.*;

@Entity
@Table(name="machines")
public class Machine {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="engaged")
    boolean isEngaged;

    @Column(name="requested")
    boolean isRequested;

    public Machine() {
    }

    public Machine(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Machine(int id, String name, boolean isEngaged, boolean isRequested) {
        this.id = id;
        this.name = name;
        this.isEngaged = isEngaged;
        this.isRequested = isRequested;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEngaged() {
        return isEngaged;
    }

    public void setEngaged(boolean engaged) {
        isEngaged = engaged;
    }

    public boolean isRequested() {
        return isRequested;
    }

    public void setRequested(boolean requested) {
        isRequested = requested;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isEngaged=" + isEngaged +
                ", isRequested=" + isRequested +
                '}';
    }
}
