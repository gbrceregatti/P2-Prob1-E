package problema1.etapa2;

import problema1.etapa1.AudioFormat;

public class AudioFacade {
	AudioFormat este;
	
	public void reporduzirSimples(String arquivo) {
		este.open(arquivo);
	    este.run();
	}
	
	public void pararSimples() {
		este.stop();
		este.release();
	}

}
