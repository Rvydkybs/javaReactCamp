package inheritance2;

public class EmailLogger extends Logger {
	@Override ////logger classýndan ovverride fonksiyon-yazýlmasada olur.
	//sadece override yaptýðýmýzý haber veriyoruz
	public void log() {
			System.out.println("email yollandý!");
		}
}
