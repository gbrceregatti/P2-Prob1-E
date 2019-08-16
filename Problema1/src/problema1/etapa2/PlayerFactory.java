package problema1.etapa2;

import problema1.etapa1.AudioFormat;
import problema1.etapa1.WAVPlayer;
import problema1.etapa1.WmaPlay;

/**
 *
 * @author user
 */
public class PlayerFactory implements AbstractFactory<AudioFormat>{
   
    @Override
    public AudioFormat create(String type){
        if(type.equalsIgnoreCase("WAVPlayer"))
            return new WAVPlayer(); 
        if(type.equalsIgnoreCase("WmaPlay"))
            return new WmaPlay();
        if(type.equalsIgnoreCase("AIFFPlayer"))
            return new WmaPlay();
        
        return null;
    }
}
