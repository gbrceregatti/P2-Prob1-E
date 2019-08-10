package problema1;

/**
 *
 * @author heichstadt
 */
public class WmaPlay {
    
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
    
    public void open(){
        System.out.println("Abri");
    }
    
    public void play(){
        System.out.println("Executei");
    }
    
    public void stop(){
        System.out.println("Parei");
    }
}
