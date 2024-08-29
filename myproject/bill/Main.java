package bill;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	System.out.println("welcome to pizzamania");
	System.out.println("which pizza: 1.veg pizza 2.nonveg pizza 3.Delux veg Pizza 4.Delux nonvage pizza");
	Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				pizza vegPizza=new pizza(true);
				vegPizza.addExtraToppings();
				vegPizza.addExtraCheese();
				vegPizza.takeAway();
				vegPizza.getBill();
				break;
			case 2:
				pizza nonvegPizza=new pizza(false);
				nonvegPizza.addExtraToppings();
				nonvegPizza.addExtraCheese();
				nonvegPizza.takeAway();
				nonvegPizza.getBill();
				break;
			case 3:
				DeluxPizza veg=new DeluxPizza(true);
				veg.basePizzaPrice=550;
				veg.addExtraToppings();
				veg.addExtraCheese();
				veg.takeAway();
				veg.getBill();
				break;
			case 4:
				DeluxPizza nonveg=new DeluxPizza(true);
				nonveg.basePizzaPrice=650;
				nonveg.addExtraToppings();
				nonveg.addExtraCheese();
				nonveg.takeAway();
				nonveg.getBill();
				break;

				
			}
}
}
