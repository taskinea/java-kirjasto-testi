package com.example;

public class App {
    public static void main(String[] args) {
    }

    private int arvo;

    public void Laskin() {
        this.arvo = 0;
    }

    public void summa(int luku) {
        this.arvo = this.arvo + luku;
    }

    public void erotus(int luku) {
        this.arvo = this.arvo + luku;
    }

    public int getArvo() {
        return this.arvo;
    }
}
