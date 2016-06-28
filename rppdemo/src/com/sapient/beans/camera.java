package com.sapient.beans;

public class camera extends product {

	public camera(int pid, String pname, double price, String lens) {
		super(pid, pname, price);
		this.lens = lens;
	}

	private String lens;

	@Override
	public String isExpensive() {
		if (getPrice() >= 10000)
			return "costlier";
		else
			return "avg";
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return super.display() + " " + lens;
	}

}
