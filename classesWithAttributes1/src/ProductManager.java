
public class ProductManager {
	public void add(Product product) {
		// JDBC
		System.out.println("Ürün eklendi " + product.getName());
	}

	// bu kullanım hatalı değilse de projelerde bir değişiklik geldiği zaman bizi
	// sıkıntıye sokabilir
	// çünkü gidip her ekranda tek tek yeni değişiklikleri kaydetmen gerek
	public void add2(int id, String name, String descriptoin, int stockAmount, double price) {
		System.out.println(id + " " + name + " " + descriptoin + " " + stockAmount + " " + price);
	}
}
