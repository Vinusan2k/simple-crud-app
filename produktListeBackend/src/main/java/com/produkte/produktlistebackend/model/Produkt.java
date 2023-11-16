package com.produkte.produktlistebackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produkte")
public class Produkt {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int     anzahl;

    private float preis;

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
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

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
