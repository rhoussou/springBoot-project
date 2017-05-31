package inventory.services;

import java.util.List;

import inventory.models.Product;

public interface ProductService {
	
	public Product getOneProduct(String id);
	
    public List<Product> getAllProduct();
	
	public List<Product> getAllProductByCategory(String category);
	
	public void addProduct(Product product);
	
	public void updateProduct(Product product);
	
}
