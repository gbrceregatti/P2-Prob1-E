package problema1.parte1;

import problema1.parte1.AudioFormat;

/**
 *
 * @author heichstadt
 */
public class WmaPlay implements AudioFormat {

    public WmaPlay(String text) {
        
    }

    public void setFile(String text){
        System.out.println("Selecionei o arquivo");
    }
    
    public void setLocation(int location){
        System.out.println("Selecionei o local");
    }
    
    public int getLocation(){
        System.out.println("Local: 1");
        return 1;
    }
    
    @Override
    protected void finalize() {
        //super.finalize();
    }
    
    @Override
    public void open(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forward(int tempo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reward(int tempo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void release() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
