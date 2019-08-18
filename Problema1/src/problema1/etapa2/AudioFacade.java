package problema1.etapa2;
import problema1.etapa1.AudioFormat;

public class AudioFacade {

    private AudioFormat audioFormat;
    private PlayerFactory playerFactory;
    
    public AudioFacade(String type){
        playerFactory = new PlayerFactory();
        audioFormat = playerFactory.create(type);
    }

    public void reproduzirSimples(String arquivo) {
        audioFormat.open(arquivo);
        audioFormat.run();
    }

    public void pararSimples() {
        audioFormat.stop();
        audioFormat.release();
    }
}
