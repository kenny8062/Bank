public class Car implements Valuable{
 	private String name;
 	private double price;
 	public Car(String name,double price){
 		this.name=name;
 		this.price=price;
 	}
 	@Override public double EstimateValue(int month){
 		
 		return price*4/5*Math.pow((0.99),month);
 	}
 	@Override public double EstimateValue(){
 		return price*4/5*Math.pow((0.99),1);
 	}
 
 	public String toString(){
 		return String.format("car name:MyCar\n initial price:%f",price);
 	}
 
 }