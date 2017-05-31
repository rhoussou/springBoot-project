package inventory.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.models.Product;
import inventory.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
    private ProductRepository productRepository;

	@Override
	public Product getOneProduct(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		return this.productRepository.findAll();
	}

	@Override
	public List<Product> getAllProductByCategory(String category) {
		return this.productRepository.findByCategory(category);
	}

	@Override
	public void addProduct(Product product) {
		this.productRepository.save(product);
	}

	@Override
	public void updateProduct(Product product) {
		this.productRepository.insert(product);
	}

}
