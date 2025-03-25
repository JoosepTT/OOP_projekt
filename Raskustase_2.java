public class Raskustase_2 extends Maatriks {
    private double punktiKordaja = 1.5;

    public Raskustase_2(double punktiKordaja) {
        super(6, 40);
        this.punktiKordaja = punktiKordaja;
    }

    public void rt2() {

    }

    public void executeEvent(int eventNum) {
        switch (eventNum) {
            case 1: System.out.println("Leidsid 10 punkti!"); skoor += 10; break;
            case 2: System.out.println("Kaotasid elu!"); elud--; break;
            case 3: System.out.println("Said boonuse! +1 elu"); elud++; break;
        }
    }
}