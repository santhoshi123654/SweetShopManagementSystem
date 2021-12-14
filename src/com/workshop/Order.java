package com.workshop;

import java.util.Map;

public class Order {
	
	private String id;
	private Map< Sweet,Integer> sweetQuantityMap;
	private String customerName;
	private long mobileNumber;
	private int totalPrice;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Map<Sweet, Integer> getSweetQuantityMap() {
		return sweetQuantityMap;
	}
	
	public void setSweetQuantityMap(Map<Sweet, Integer> sweetQuantityMap) {
		this.sweetQuantityMap = sweetQuantityMap;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", sweetQuantityMap=" + sweetQuantityMap + ", customerName=" + customerName
				+ ", mobileNumber=" + mobileNumber + ", totalPrice=" + totalPrice + "]";
	}
	
}
