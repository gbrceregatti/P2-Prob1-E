package problema1.etapa2;
import problema1.etapa1.AudioFormat;

public class MP3DJ implements AudioFormat {

    private ConsoleAdapter console;
    
    public MP3DJ(){
        console = new ConsoleAdapter();
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
        console.writeLine("Recebei como parâmetro a quantidade de\n"
                + "segundos que devem ser avançados no arquivo a partir do ponto\n"
                + "atual");
    }

    @Override
    public void reward(int milliseconds) {
        console.writeLine("recebe como parâmetro a quantidade de segundos que devem ser\n"
                + "retrocedidos no arquivo a partir do ponto atual.");
    }

    @Override
    public void release() {
        console.writeLine("Fechei o arquivo de audio e liberei a memória");
    }

    public void open() {
        console.writeLine("Abri o arquivo de audio");
    }
}
