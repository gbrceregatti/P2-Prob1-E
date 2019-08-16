package problema1;

import problema1.etapa1.AudioFormat;
import problema1.etapa1.WAVPlayer;
import problema1.etapa2.Player;
import problema1.etapa2.PlayerFactory;

/**
 *
 * @author User
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        PlayerFactory teste = new PlayerFactory();
        
        AudioFormat player = teste.create("WAVPlayer");
        player.open("skjad");
    }
}
