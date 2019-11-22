package secao13;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	
	private Date moment;
	
	private Status status;
	
	private Client client;
	
	private List<OrderItem> Orders = new ArrayList<>();

	public Order(Date moment, Status status, Client client) {

		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void addOrders(OrderItem orderItem) {
		
		Orders.add(orderItem);
		
	}
	
	public void removeOrders(OrderItem orderItem) {
		
		Orders.remove(orderItem);
		
	}
	

	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		StringBuilder sb = new StringBuilder();
		sb.append(client.getName()+"\n");
		sb.append(client.getEmail()+"\n");
		sb.append(client.getBirthDate()+"\n");
		sb.append(sdf.format(client.getBirthDate())+"\n");
		for (OrderItem order: Orders) {
			sb.append(order.getQuantity())
			
		}
		
		
		
	}

}
