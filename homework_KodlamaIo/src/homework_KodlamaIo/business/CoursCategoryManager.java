package homework_KodlamaIo.business;

import homework_KodlamaIo.dataAccess.CataegoryDao;
import homework_KodlamaIo.entities.Category;

public class CoursCategoryManager {
	private CataegoryDao cataegoryDao;

	public CoursCategoryManager(CataegoryDao cataegoryDao) {
		this.cataegoryDao = cataegoryDao;
	}

	public void add(Category category) throws Exception {
		Category[] categories = { new Category("Programlama"), new Category("Tümü") };
		for (Category c : categories) {
			if (category.getCategoryName() == c.getCategoryName()) {
				throw new Exception("Hata : Kategori ismi tekrar edemez");
			}
		}
		cataegoryDao.add(category);
	}
}
