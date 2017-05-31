package inventory.controller;

import inventory.models.Product;
import inventory.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
        return productService.getAllProduct();
    }

    @PutMapping
    public void update(@RequestBody Product product){
    	productService.updateProduct(product);
    }

    @PostMapping
    public void insert(@RequestBody Product product){
    	productService.addProduct(product);;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") String id){
        return productService.getOneProduct(id);
    }

    @GetMapping("/{category}")
    public List<Product> getByCategory(@PathVariable("category") String category) {
        return productService.getAllProductByCategory(category);
    }
 
}
