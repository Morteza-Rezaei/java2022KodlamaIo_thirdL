
public class Main {

	public static void main(String[] args) {// parametre
		Product product = new Product(1, "laptop", "asus", 2, 200, "");

		System.out.println("-------------------");

		// parametresiz getter ve setter yardımıyla
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(150);
		product.setStockAmount(6);
		product.setRenk("Sarı");
		product.setKod("3");

		// not --> getKod'da farklı bir değer döndürmüştük o yuzden çıktı L1
		System.out.println(product.getKod());
		// burda ise aldığı parametreyi döndürür çünkü biz getterlerinde böyle return
		// etmiştik
		System.out.println(product.getName() + product.getDescription());

		System.out.println("-------------------");

		ProductManager productManager = new ProductManager();
		productManager.add(product);

		System.out.println("-------------------");

		productManager.add2(1, "laptop", "asus", 2, 200);
		productManager.add2(1, "laptop", "asus", 2, 200);
		productManager.add2(1, "laptop", "asus", 2, 200);
		productManager.add2(1, "laptop", "asus", 2, 200);

	}

}
