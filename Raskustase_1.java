public class Raskustase_1 extends Maatriks {
    private Sundmused sundmused = new Sundmused();

    public Raskustase_1() {
        super(5, 50);
    }

    public void executeEvent(int eventNum) throws InterruptedException {
        switch (eventNum) {
            case 1: sundmused.sundmus_1(1); break;
            case 2: sundmused.sundmus_2(1); break;
            case 3: sundmused.sundmus_3(1); break;
            case 4: sundmused.sundmus_4(1); break;
            case 5: sundmused.sundmus_5(1); break;
            case 6: sundmused.sundmus_6(1); break;
            case 7: sundmused.sundmus_7(1); break;
            case 8: sundmused.sundmus_8(1); break;
            case 9: sundmused.sundmus_9(1); break;
            case 10: sundmused.sundmus_10(1); break;
        }
    }
}