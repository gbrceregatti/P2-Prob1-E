package problema1;

/**
 *
 * @author heichstadt
 */
public class WAVPlayer {

    public WAVPlayer() { }

    public void play() {
        System.out.println("Executei");
    }

    public void stop() {
        System.out.println("Parei");
    }

    public int forward(int value) {
        return 1;
    }

    public int reward(int value) {
        System.out.println("Lancei 1");
        return 1;
    }

    @Override
    public void finalize() {
        System.out.println("Finalizei");
    }
}
