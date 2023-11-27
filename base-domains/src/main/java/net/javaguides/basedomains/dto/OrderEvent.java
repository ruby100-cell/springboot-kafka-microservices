package net.javaguides.basedomains.dto;

import java.util.Objects;

public class OrderEvent {
	private String message;
	private String status;
	private Order order;
	public OrderEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderEvent(String message, String status, Order order) {
		super();
		this.message = message;
		this.status = status;
		this.order = order;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public int hashCode() {
		return Objects.hash(message, order, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderEvent other = (OrderEvent) obj;
		return Objects.equals(message, other.message) && Objects.equals(order, other.order)
				&& Objects.equals(status, other.status);
	}
	@Override
	public String toString() {
		return "OrderEvent [message=" + message + ", status=" + status + ", order=" + order + "]";
	}

}
