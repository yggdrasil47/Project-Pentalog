package mihai.radu.pantalog;

public class MainProductDao {

	public static void main(String[] args) {
		ProductDao productDao = new ProductDaoImpl();

		System.out.println(productDao.toString());

		System.out.println("The  inventory value is:"
				+ productDao.calculateInventoryTotal());

	}

}
