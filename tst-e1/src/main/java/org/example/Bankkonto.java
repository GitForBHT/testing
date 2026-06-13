package org.example;



public class Bankkonto {

    private double kontostand;

    // Konstruktor: Erstellt ein neues Konto mit einem Startguthaben
    public Bankkonto(double startguthaben) {
        if (startguthaben < 0) {
            throw new IllegalArgumentException("Startguthaben darf nicht negaiv sein.");      
        }
        this.kontostand = startguthaben;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen(double betrag) {
        if (betrag <= 0) {
            throw new IllegalArgumentException("Betrag muss größer als 0 sein.");
        }
        this.kontostand += betrag;
    }

    public void abheben(double betrag) {
        if (betrag <= 0) {
            throw new IllegalArgumentException("Betrag muss größer als 0 sein.");
        }
        
        if (betrag > this.kontostand) {
            throw new IllegalArgumentException("Nicht genügend Guthaben.");
        }
        this.kontostand -= betrag;
    }

}