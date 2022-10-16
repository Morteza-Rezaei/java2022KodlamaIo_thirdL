package homework_KodlamaIo.dataAccess;

import homework_KodlamaIo.entities.Category;

public class JdbcCategoryDao implements CataegoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori Jdbc ile veritabanına eklendi :" + category.getCategoryName());
	}

}
