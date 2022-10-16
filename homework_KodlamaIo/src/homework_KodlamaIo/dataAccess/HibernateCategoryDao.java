package homework_KodlamaIo.dataAccess;

import homework_KodlamaIo.entities.Category;

public class HibernateCategoryDao implements CataegoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori Hibernate ile veritabanına eklendi :" + category.getCategoryName());
	}

}
