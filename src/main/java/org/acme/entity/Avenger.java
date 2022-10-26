package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Avenger extends PanacheEntity {

    public String name;
    public String civilName;
    public boolean snapped;

    public Avenger() {
    }

    public Avenger(String name, String civilName, boolean snapped) {
        this.name = name;
        this.civilName = civilName;
        this.snapped = snapped;
    }
}
