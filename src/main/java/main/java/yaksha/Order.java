package main.java.yaksha;

import java.util.ArrayList;

import java.util.List;
import main.java.yaksha.FoodProduct;
import main.java.yaksha.Order;
public class Order{

	
	private double discountPercentage;
	private List<FoodProduct> foodList=new ArrayList<FoodProduct>();

	
	
	
	
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public List<FoodProduct> getFoodList() {
		return foodList;
	}
	public void setFoodList(List<FoodProduct> foodList) {
		this.foodList = foodList;
	}
	
	
	public double findDiscount(String bankName)
	{ 
		/*You code here*/
		return 0;
			
	}
	
	
	public int addToCart(FoodProduct foodProductObject)
	{ 
		/*You code here*/
		return 0;
		
	}
	
	
	public double calculateTotalBill()
	{ 
		/*You code here*/
		
		return 0;
	}
}

