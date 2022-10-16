
public class Product {
	// not---->Overloading
	// yapıcı yada constructor defualt olarak vardı yazmasak da program hata vermez
	// parametre verdiğin zaman onu newlerken de parametre vermek zorundasın
	// getter ve settere gerek yok
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("constructor yani yapıcı block çalıştı");
		// burada set ettik
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
	}

	// bu parametresiz constructor için getter ve setter ile çalışmak isterken
	public Product() {

	}

	// attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	// sadece okumak için getter
	// değer atmak için setter
	// this.id yani bu sınıftaki id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	// not
	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}
}
