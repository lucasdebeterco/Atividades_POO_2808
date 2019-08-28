package ex10;

public class Televisor {
	private int volume;
	private int canal;
	
	public Televisor(int volume, int canal) {
		this.volume = volume;
		this.canal = canal;
	}
	
	public int aumentarVolume(int qnt) {
		volume += qnt;
		if(volume > 100) {
			volume = 100;
		}
		return volume;
	}
	
	public int diminuirVolume(int qnt) {
		volume -= qnt;
		if(volume < 0) {
			volume = 0;
		}
		return volume;
	}
	
	public int selecionarCanal(int canal) {
		this.canal = canal;
		if(canal < 0) {
			this.canal = 0;
		}
		else if (canal > 100) {
			this.canal = 100;
		}
		return canal;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Volume: " + volume);
		sb.append("\nCanal: " + canal);
		return sb.toString();
	}
	
	
	
}
