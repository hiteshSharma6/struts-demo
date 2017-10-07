package com.ims.accounts;

public class Fee {
	private String name;
	private String amount;
	@Override
	public String toString() {
		return "Fee [name=" + name + ", amount=" + amount + "]";
	}
	public Fee() {}
	public Fee(String name, String amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String execute() {
		return "success";
	}


}
