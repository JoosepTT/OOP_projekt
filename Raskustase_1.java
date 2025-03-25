 public class Raskustase_1 extends Maatriks {
    private double punktiKordaja = 0;

    public Raskustase_1(double punktiKordaja) {
        super(5, 50);
        this.punktiKordaja = punktiKordaja;
    }

    public void sundus_1() {

    }




    public void executeEvent(int eventNum) {
        switch (eventNum) {
            case 1: System.out.println("Leidsid 5 punkti!"); skoor += 5; break;
            case 2: System.out.println("Kaotasid elu!"); elud--; break;
            case 3: System.out.println("Ei juhtunud midagi."); break;
        }
    }
}