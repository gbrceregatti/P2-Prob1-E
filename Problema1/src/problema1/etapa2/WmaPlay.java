package problema1.etapa2;
import problema1.etapa1.AudioFormat;

public class WmaPlay implements AudioFormat {

    private ConsoleAdapter console;
    
    public WmaPlay(String text) {
        console = new ConsoleAdapter();
    }
    public WmaPlay() {
        console = new ConsoleAdapter();
    }
    

    public void setFile(String text){
        console.writeLine("Selecionei o arquivo");
    }
    
    public void setLocation(int location){
        console.writeLine("Selecionei o local");
    }
    
    public int getLocation(){
        console.writeLine("Local: 1");
        return 1;
    }
    
    @Override
    protected void finalize() throws Throwable {
        console.writeLine("finalizei a instância da classe");
        super.finalize();
    }
    
    @Override
    public void open(String name) {
        console.writeLine("Carreguei o arquivo de audio na memória");
    }

    @Override
    public void run() {
        console.writeLine("Iniciei a reprodução do arquivo de audio");
    }

    @Override
    public void pause() {
        console.writeLine("Pausando a reprodução do arquivo de audio");
    }

    @Override
    public void stop() {
        console.writeLine("Parando a reprodução e retornando ao início do arquivo");
    }

    @Override
    public void forward(int milliseconds) {
        console.writeLine("Recebei como parâmetro a quantidade de\n" +
"segundos que devem ser avançados no arquivo a partir do ponto\n" +
"atual");
    }

    @Override
    public void reward(int milliseconds) {
        console.writeLine("recebe como parâmetro a quantidade de segundos que devem ser\n" +
"retrocedidos no arquivo a partir do ponto atual.");
    }

    @Override
    public void release() {
        console.writeLine("Fechei o arquivo de audio e liberei a memória");
    }
}
