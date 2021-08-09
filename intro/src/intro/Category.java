package intro;

public class Category {
	private int id;
	private String name;
	
	public Category(int id, String name) {//cunstructor ile de get-set amac�n� yapabiliriz
		this.id = id;
		this.name = name;
	}
	public int getId() {//get de�er okur yani bir de�er d�nd�r�cez
		return this.id;
	}
	public void setId(int id) {
		this.id=id;//class i�indeki id'yi girdi�im de�er yap
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {//set bir de�er verir yani de�eri biz aticaz
		this.name=name;
	}
}
