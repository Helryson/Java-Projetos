package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> pedidoItem = new ArrayList<>();
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
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

	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getPedidoItem() {
		return pedidoItem;
	}

	public void addItem(OrderItem item) {
		pedidoItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		pedidoItem.remove(item);
		}
	
	public Double total() {
		double sum = 0;
		for(OrderItem items : pedidoItem) {
			sum += items.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMARY: \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.toString() + "\n");
		sb.append("Order items: \n");
		for (OrderItem item : pedidoItem) {
			sb.append(item.toString() + "\n");
		}
		sb.append("Total price: $" + total());
		
		return sb.toString();
	}
}
