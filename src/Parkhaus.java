/**
 * Das Parkhaus hat eine bestimmte Zahl von Plätzen, die mit ausgabe() ausgegeben erden kann.
 * Ein und Ausfahren ist durch jeweilige Methoden möglich, welche alle synchronized sind,
 * da es zu Fehlern kommt, wenn mehrere Autos bzw. Threads auf die Plätze eines Parkhauses zugreifen
 */
public class Parkhaus {
    private int plaetze;
    public Parkhaus(int plaetze){
        assert plaetze > 0;
        this.plaetze = plaetze;
    }

    public synchronized void ausgabe(){
        System.out.println("Freie Plätze:" + plaetze);
    }
    public synchronized void einfahren(){
        while(plaetze==0){
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            plaetze--;
        }
    }
    public synchronized void ausfahren(){
        plaetze++;
        notify();
    }
}
