/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1.parte1;

/**
 *
 * @author User
 */
public interface AudioFormat {
    
    public void open(String nome);
    
    public void run();
    
    public void pause();
    
    public void stop();
    
    public void forward(int tempo);
    
    public void reward(int tempo);
    
    public void release();
    
}
