public class Raskustase_3 extends Maatriks {
    private Sundmused sundmused = new Sundmused();

    public Raskustase_3() {
        super(7, 70);
    }

    public void executeEvent(int eventNum) throws InterruptedException {
        switch (eventNum) {
            case 1: sundmused.sundmus_1(3); break;
            case 2: sundmused.sundmus_2(3); break;
            case 3: sundmused.sundmus_3(3); break;
            case 4: sundmused.sundmus_4(3); break;
            case 5: sundmused.sundmus_5(3); break;
            case 6: sundmused.sundmus_6(3); break;
            case 7: sundmused.sundmus_7(3); break;
            case 8: sundmused.sundmus_8(3); break;
            case 9: sundmused.sundmus_9(3); break;
            case 10: sundmused.sundmus_10(3); break;
        }
    }
}