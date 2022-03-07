package store;

import java.util.*;

public class test {
	static double total;
	static int q;
	

	public static void main(String[] args) {
		product obj = new product();
		obj.setName("Punching Bag");
		obj.setPrice(2500.00);
		obj.setStock(15);
		System.out.println(obj.getName());
		System.out.println(obj.getPrice());
		System.out.println(obj.getStock());
		
		obj.addToCart(obj.getName());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the quantity");
		q = sc.nextInt();
		
		if(obj.getStock()>= q) {
			total=obj.getPrice()*q;
			System.out.println("Your product is costing: "+total);
		}
		else {
			System.out.println("Sorry we don't have enough stock !!");
		}
	}
}
