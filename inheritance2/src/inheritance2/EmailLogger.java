package inheritance2;

public class EmailLogger extends Logger {
	@Override ////logger class�ndan ovverride fonksiyon-yaz�lmasada olur.
	//sadece override yapt���m�z� haber veriyoruz
	public void log() {
			System.out.println("email yolland�!");
		}
}
