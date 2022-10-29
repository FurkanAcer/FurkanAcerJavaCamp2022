package ClassesWithAttributes;

public class Main {
	public static void main(String[] args) {
	
	Product product =new Product(1,"Laptop","Asus Laptop",5000,3);
	
	product.setId(1);//ikinci yapıucı blok bu şekilde çalışıyor
	product.setDescription("Asus Laptop");
	product.setName("Laptop");
	product.setPrice(5000);
	product.setStockAmount(3);
	product.getKod();
	
	ProductManager productManager = new ProductManager();
	productManager.Add(product);
	
	System.out.println(product.getName());
	
	}
}
