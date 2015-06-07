package mihai.radu.pantalog;

import java.util.List;

public interface ProductDao {
	public List<Product> getAllProducts();
	public Product getProduct(String id);
	public void updateProduct(Product product);
	public void deleteProduct(Product product);
	public double calculateInventoryTotal();
}
