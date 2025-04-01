public class Raskustase_2 extends Maatriks {
    private Sundmused sundmused = new Sundmused();

    public Raskustase_2() {
        super(6, 60);
    }

    public void executeEvent(int eventNum) throws InterruptedException {
        switch (eventNum) {
            case 1: sundmused.sundmus_1(2); break;
            case 2: sundmused.sundmus_2(2); break;
            case 3: sundmused.sundmus_3(2); break;
            case 4: sundmused.sundmus_4(2); break;
            case 5: sundmused.sundmus_5(2); break;
            case 6: sundmused.sundmus_6(2); break;
            case 7: sundmused.sundmus_7(2); break;
            case 8: sundmused.sundmus_8(2); break;
            case 9: sundmused.sundmus_9(2); break;
            case 10: sundmused.sundmus_10(2); break;
        }
    }
}