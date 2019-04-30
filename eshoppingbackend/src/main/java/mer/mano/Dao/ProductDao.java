package mer.mano.Dao;

import java.util.List;

import mer.mano.model.Product;

public interface ProductDao {

	public boolean addProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean updateCategory(Product product);
	public List<Product> listProducts();
	public Product getProduct(int ProductId); 
	}

