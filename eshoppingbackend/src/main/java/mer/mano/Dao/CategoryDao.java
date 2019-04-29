package mer.mano.Dao;

import java.util.List;

import mer.mano.model.Category;

public interface CategoryDao {

public boolean addCategory(Category category);
public boolean deleteCategory(Category category);
public boolean updateCategory(Category category);
public List<Category> listCategories();
public Category getCategory(int CategoryId); 
}
