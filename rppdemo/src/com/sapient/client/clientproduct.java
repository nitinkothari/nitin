package com.sapient.client;

import com.sapient.beans.camera;
import com.sapient.beans.computer;
import com.sapient.beans.product;

public class clientproduct {

	public static void main(String[] args) {
		
	product[] arr= new product[4];	
		arr[0] = new computer(1001,"acer lappi",50000,"intel platinum 5");
		arr[1] = new computer(1002,"dell lappi",30000,"intel i7");
		arr[2] = new computer(1003,"nkon cam",6000,"14MPX");
		arr[3] = new camera(1004,"canonlappi",16000,"18MPX");
		
		for(product p:arr){
			System.out.println(p.display() + " " + p.isExpensive());
		}
	}
}
