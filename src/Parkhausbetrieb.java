/**
 * Parkhausbetrieb ist das eigentliche Programm, was ein Parkhaus, Zähler und Autos erzeugt.
 * Gestartet werden alle Threads bereits durch ihre Konstruktoren.
 */

public class Parkhausbetrieb {
    public static void main(String[] args) {
        Parkhaus parkhaus = new Parkhaus(10);
        Zaehler z = new Zaehler(parkhaus);
        for(int i = 1; i <= 40; i++){
            Auto a = new Auto("Auto " + i, parkhaus);
        }
    }
}
