package Coffe;

import java.text.DecimalFormat;

public class SecondeIteration {
	
	
	public static double prix(double amount, char drink) {
		 double price=0, total=0;
		switch(drink) {
		  case 'T': 
			 price   = 0.4;
		    break;
		  case 'H':
			price = 0.5;
		    break;
		  case 'C':
			 price= 0.6;
		    break;
		  default:	  
		}
		 
			total = amount - price;
			
			return total;
		
	}
    		
	public static String payDrink(double amount, char drink,int sugar) {
		
		FirstIteration makeDirnk = new  FirstIteration();
		double total = 	prix(amount, drink);
		
		if(total >= 0) {			
			return makeDirnk.prepareBoisson(drink, sugar);
			
		}else {
			return "Merci de vouloir inseret le correct montant: " + total;
		}
	}

	public static void main(String[] args) {
		System.out.println(payDrink(0.3,'T', 0));
		System.out.println(payDrink(0.4,'T', 0));
		System.out.println(payDrink(0.5,'T', 3));
		System.out.println(payDrink(0.4,'C', 1));
		System.out.println(payDrink(0.6,'C', 2));
		System.out.println(payDrink(0.7,'C', 0));
	}

}
