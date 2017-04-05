
public class Car implements Valuable{
	private String name;
	private double price;
	public Car(String name,double price){
		this.name=name;
		this.price=price;
		this.price=this.price*0.8;
	}
	@Override public double EstimateValue(int month){
		price=price*Math.pow((0.99),month);
		return price;
	}

	public String toString(){
		return String.format("car name:MyCar\n initial price:%f",price);
	}

}
