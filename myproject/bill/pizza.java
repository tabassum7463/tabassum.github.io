package bill;
import java.util.Scanner;
public class pizza {
	protected int price;
	private Boolean veg;
	protected int extraCheesePrice=100;
	protected int extraToppingsPrice=150;
	protected int backpackPrice=20;
	protected int basePizzaPrice;
private boolean isExtraCheeseAdded=false;
private boolean isExtraToppingsAdded=false;
private boolean isOptedForTakeaway=false;
Scanner in=new Scanner(System.in);
public pizza(Boolean veg)
{
	this.veg=veg;
	if(this.veg) {
		this.price=300;
	}
	else {
		this.price=400;
	}
	basePizzaPrice=this.price;
}
public void addExtraCheese()
{
	System.out.println("extra cheese(y/n)?");
	char ch=in.next().charAt(0);
	switch(ch)
	{
		case ('y'):
			isExtraCheeseAdded=true;
		this.price += extraCheesePrice;
		break;
	
         case ('n'):
	isExtraCheeseAdded=false;
break;
		
         }
	
	}
public void addExtraToppings()
{
	System.out.println("want take away(y/n)?");
	char ch=in.next().charAt(0);
	switch(ch)
	{
		case ('y'):
			isExtraToppingsAdded=true;
		this.price += extraToppingsPrice;
		break;
	
         case ('n'):
         
	isExtraToppingsAdded=false;
break;
		
         }

}
	public void takeAway()
	{	
	
	System.out.println("extra cheese(y/n)?");
		char ch= Character.toLowerCase(in.next().charAt(0));
		switch(ch)
		{
			case ('y'):
				isOptedForTakeaway=true;
			this.price += backpackPrice;
			break;
		
	         case ('n'):
	         
		isOptedForTakeaway=false;
	break;
			
		}
	}
public void getBill() {
	String bill=" ";
	System.out.println("pizza: "+basePizzaPrice);
	if(isExtraCheeseAdded) {
		bill +="Extra cheese:" +extraCheesePrice + "\n";
	}
	if(isExtraToppingsAdded) {
		bill +="Extra toppings:" +extraToppingsPrice + "\n";
	}
	if(isOptedForTakeaway) {
		bill +="back away:" +backpackPrice + "\n";
	}
	bill += "\nTotal amount:"+this.price+"\n";
	System.out.println(bill);
	System.out.println("\n\n\nThank you!!visit again......");
	


	
	
}
	}



