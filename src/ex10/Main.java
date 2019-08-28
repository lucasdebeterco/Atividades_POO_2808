package ex10;

public class Main {

	public static void main(String[] args) {
		// volume, canal
		Televisor tv = new Televisor(20,20);
		tv.aumentarVolume(50);
		tv.diminuirVolume(10);
		tv.selecionarCanal(40);
		System.out.println(tv);

	}

}
