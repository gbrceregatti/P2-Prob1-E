package problema1.etapa1;

public interface AudioFormat {
    
    void open(String name);
    
    void run();
    
    void pause();
    
    void stop();
    
    void forward(int milliseconds);
    
    void reward(int milliseconds);
    
    void release();
}
