/**
 * der Zähler ist ebenfalls ein Thread und greift wie das Auto auf die Plätze Variable zu. Mit dem Unterschied,
 * dass Zähler weder ein noch ausfährt und die Zahl der Plätze nicht verändert.
 * Er gibt lediglich die Anzahl von Plätzen im Parkhaus aus
 */

public class Zaehler extends Thread {
    private Parkhaus parkhaus;
    public Zaehler(Parkhaus parkhaus){
        this.parkhaus = parkhaus;
        start();
    }
    public void run(){
        while(true){
            try{
                sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            parkhaus.ausgabe();
        }
    }
}
