package day10;

public class Product_ISD implements Comparable<Product_ISD> {
	
	int id;
	String name;
	double price;
	
	public Product_ISD() {
	}

	public Product_ISD(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "Product_ISD [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product_ISD product) {
//		int flag = this.id - product.id;
//		if(flag == 0) {
//			this.name.compareTo(product.name);
//		}
		int flag = this.name.compareTo(product.name);
		if(flag == 0) {
			Double.compare(this.price, product.price);
		}
		return flag;
	}
	
}

