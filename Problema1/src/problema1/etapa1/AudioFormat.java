package problema1.etapa1;

/**
 *
 * @author User
 */
public interface AudioFormat {
    
    void open(String nome);
    
    void run();
    
    void pause();
    
    void stop();
    
    void forward(int tempo);
    
    void reward(int tempo);
    
    void release();
}
