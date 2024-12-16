package staticdemo;

public class StaticVariable {
	String name;
	double price;
	public static String category="smart phone";
	
	public StaticVariable(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	public void displayDetails()
	{
		System.out.println("Name " +name);
		System.out.println("Price "+price);
		System.out.println("category "+category);
		System.out.println();
		
	}
	

}
