
public class ProductManager {
	public void add(Product product) {
		if (Productvalidator.isValid(product)) {
			System.out.println("Eklendi");
		} else {
			System.out.println("Ürün bilgileri geçersizdir");
		}

		Productvalidator productvalidator = new Productvalidator();
		productvalidator.bisey();
	}
}
