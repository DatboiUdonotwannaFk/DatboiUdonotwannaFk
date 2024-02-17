public class Order{
	
	static int softdrinks, addons, qty1,qty2,price,total,container;
   public static void main (String[]args){
	   softdrinks = Integer.valueOf(args[0]);
	   container = Integer.valueOf(args[1]);
	   qty1 = Integer.valueOf(args[2]);
	   addons = Integer.valueOf(args[3]);
	   qty2 = Integer.valueOf(args[4]);
	   System.out.print("You Ordered : ");
	   choice(softdrinks);
	   System.out.print("Total Payment : ");
	   payment(total);
   }
    
	static void choice(int softdrinks){
		switch (softdrinks){
			case 1: System.out.println("COKE");
			break;
			case 2: System.out.println("PEPSI");
			break;
			case 3: System.out.println("R.C");
			break;
			case 4: System.out.println("ROYAL");
			break;
			case 5: System.out.println("SPRITE");
			break;
			default: System.out.println("Order: Invalid");
			break;
		}
	switch (container){

			case 'c': System.out.println("Can - php 30");
					int can=30;
			break;
			case 'b': System.out.println("Bottle 8oz - php 12");
					int b8oz=12;
			break;
			case '2': System.out.println("Bottle 12oz - php 15");
					int b12oz=15;
			break;
			case '3': System.out.println("Bottle 18oz - php 18");
					int b180z=18;
			break;
			default: System.out.println("size: Invalid");
			break;
		}

	switch (addons){

			case 'c': System.out.println("Add ons : CUPS - php 5");
					int cup=5;
			break;
			case 'i': System.out.println("Add ons : ICE - php 2");
					int ice=2;
			break;
			case 0: System.out.println("Add ons : NONE");
					int none=0;
			break;
			default: System.out.println("Add ons : Invalid");
			break;
		}
	}
	
 static void payment(int total){
	 	int total1 = container*qty1;
	 	int total2 = addons*qty2;
	 	int totalpayment = total1+total2;
	 System.out.print(totalpayment);
		
		
		}
   }