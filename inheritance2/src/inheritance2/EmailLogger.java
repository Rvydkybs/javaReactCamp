package inheritance2;

public class EmailLogger extends Logger {
	@Override ////logger classından ovverride fonksiyon-yazılmasada olur.
	//sadece override yaptığımızı haber veriyoruz
	public void log() {
			System.out.println("email yollandı!");
		}
}
