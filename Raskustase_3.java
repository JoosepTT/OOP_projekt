public class Raskustase_3 extends Maatriks {
    private double punktiKordaja = 2.0;

    public Raskustase_3(double punktiKordaja) {
        super(7, 30);
        this.punktiKordaja = punktiKordaja;
    }

    public void rt3() {

    }

    public void executeEvent(int eventNum) {
        switch (eventNum) {
            case 1: System.out.println("Leidsid 15 punkti!"); skoor += 15; break;
            case 2: System.out.println("Kaotasid 2 elu!"); elud -= 2; break;
            case 3: System.out.println("Ei juhtunud midagi."); break;
        }
    }
}