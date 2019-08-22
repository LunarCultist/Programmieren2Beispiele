/**
 * Threads sind in diesem Beispiel Autos, die gemeinsam auf ein Parkhaus zugreifen, d.h. ein- und ausfahren wollen
 */

public class Auto extends Thread {
    private Parkhaus parkhaus;
    public Auto(String name, Parkhaus parkhaus){
        super(name);
        this.parkhaus = parkhaus;
        start();
    }
    public void run(){
        while(true){
            try{
                sleep((int)(Math.random() * 3000));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            parkhaus.einfahren();
            System.out.println(getName() + ": eingefahren");
            try{
                sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(getName() + ": ausgefahren");
            parkhaus.ausfahren();
        }
    }
}
