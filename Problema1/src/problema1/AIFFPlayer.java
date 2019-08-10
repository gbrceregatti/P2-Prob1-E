package problema1;

/**
 *
 * @author User
 */
public class AIFFPlayer {

    public AIFFPlayer(String nome) {
    }

    public void play() {
        System.out.println("Executei");
    }

    public void stop() {
        System.out.println("Parei");
    }

    public int pause() {
        System.out.println("Retornei 1");
        return 1;
    }

    public void setCursor(int cursor) {
        System.out.println("Selecionei o cursor");
    }

    public void release() {
        System.out.println("Lancei");
    }
}
