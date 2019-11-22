package secao13;

public class OrderItem {
	
	private int quantity;
	
	
	public OrderItem(int quantity) {
		this.quantity = quantity;
	
	}

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public double subTotal(Product product){
		return quantity*product.getPrice();
	}

	
}
