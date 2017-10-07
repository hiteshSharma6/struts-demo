package com.ims.action.fee;

import com.ims.accounts.Fee;
import com.opensymphony.xwork2.ActionSupport;

public class FeeAction extends ActionSupport{
	private Fee fee;
	public String execute() {
		setFee(fee);
		System.out.println("ohhh");
		return "success";
	}
	
	public Fee getFee() {
		System.out.println("Get Fee : ");
		return fee;
	}
	
	public void setFee(Fee fee) {
		System.out.println("Set Fee : "+ fee.toString());
		this.fee = fee;
	}
}
