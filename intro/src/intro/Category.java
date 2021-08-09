package intro;

public class Category {
	private int id;
	private String name;
	
	public Category(int id, String name) {//cunstructor ile de get-set amacýný yapabiliriz
		this.id = id;
		this.name = name;
	}
	public int getId() {//get deðer okur yani bir deðer döndürücez
		return this.id;
	}
	public void setId(int id) {
		this.id=id;//class içindeki id'yi girdiðim deðer yap
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {//set bir deðer verir yani deðeri biz aticaz
		this.name=name;
	}
}
