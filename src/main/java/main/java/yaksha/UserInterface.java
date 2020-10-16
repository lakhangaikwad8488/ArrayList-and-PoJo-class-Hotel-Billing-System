package main.java.yaksha;

import java.util.Scanner;
import main.java.yaksha.FoodProduct;
import main.java.yaksha.Order;

public class UserInterface{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int itemno;
		String bank;
		
		System.out.println("Enter the number of items");
		itemno=sc.nextInt();
		System.out.println("Enter the item details");
		
		
		Order o=new Order();
		
		for(int i=0;i<itemno;i++)
		{
			FoodProduct fd=new FoodProduct();
		System.out.println("Enter the item id");
		fd.setFoodId(sc.nextInt());
		System.out.println("Enter the item name");
		fd.setFoodName(sc.next());
		System.out.println("Enter the cost per unit");
		fd.setCostPerUnit(sc.nextDouble());
		System.out.println("Enter the quantity");
		fd.setQuantity(sc.nextInt());
		/*Write code here . Call method to add item in list*/
		}
		
		
		System.out.println("Enter the bank name to avail offer[HDFC/SBI/ICICI/CUB/OTHERS]");
		bank=sc.next();
		/*Write code here . this method will return discount percentage according to respected bank.*/
		
		
		/*Write code here . calculateTotalBill() this method will return bill by finding .*/
		
		
		
	}
}
