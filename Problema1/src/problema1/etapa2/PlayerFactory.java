package problema1.etapa2;
import problema1.etapa1.AudioFormat;
import problema1.etapa1.WAVPlayer;
import problema1.etapa1.WmaPlay;

public class PlayerFactory implements AbstractFactory<AudioFormat>{
   
    @Override
    public AudioFormat create(String type){
        if(type.equalsIgnoreCase("WAVPlayer"))
            return new WAVPlayer(); 
        if(type.equalsIgnoreCase("WmaPlay"))
            return new WmaPlay();
        if(type.equalsIgnoreCase("AIFFPlayer"))
            return new WmaPlay();
        if(type.equalsIgnoreCase("AACPlayer"))
            return new AACPlayer();
        if(type.equalsIgnoreCase("MP3DJ"))
            return new MP3DJ();
        
        return null;
    }
}
