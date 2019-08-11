package problema1.etapa1;

import problema1.etapa1.AudioFormat;

/**
 *
 * @author User
 */
public class AIFFPlayer implements AudioFormat {

    private int cursor;

    public AIFFPlayer(String text) {
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    @Override
    public void open(String nome) {
        System.out.println("Carreguei o arquivo de audio na memória");
    }

    @Override
    public void run() {
        System.out.println("Iniciei a reprodução do arquivo de audio");
    }

    @Override
    public void pause() {
        System.out.println("Pausando a reprodução do arquivo de audio");
    }

    @Override
    public void stop() {
        System.out.println("Parando a reprodução e retornando ao início do arquivo");
    }

    @Override
    public void forward(int tempo) {
        System.out.println("Recebei como parâmetro a quantidade de\n"
                + "segundos que devem ser avançados no arquivo a partir do ponto\n"
                + "atual");
    }

    @Override
    public void reward(int tempo) {
        System.out.println("recebe como parâmetro a quantidade de segundos que devem ser\n"
                + "retrocedidos no arquivo a partir do ponto atual.");
    }

    @Override
    public void release() {
        System.out.println("Fechei o arquivo de audio e liberei a memória");
    }
}
