package com.sapient.beans;

public class computer extends product{
	
		private String mboard;

		public computer(int pid, String pname, double price, String mboard) {
			super(pid, pname, price);
			this.mboard = mboard;
		}

		@Override
		public String isExpensive() {
			if(getPrice() >= 45000)
			return "costlier";
			else
				return "average";
		}

		@Override
		public String display() {
			
			return super.display() + " " + mboard;
		}
}
