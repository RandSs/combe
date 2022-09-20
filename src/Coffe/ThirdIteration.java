package Coffe;

public class ThirdIteration {
	

	static String message = "Merci de bien vouloir inserer: ";
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
		  	case 'O':
				 price= 0.6;
			    break;
		  default:	  
		}
			total = amount - price;
			return total;
	}
	
	
	
	public static  String prepareOrangeJuice(char type) {

		String messageOrange  = type+"::" ;
		return  messageOrange ;
	}
	
	public static  String prepareBoissonExtraHot(char type, int sucre) {
		String messageAvecSucreEHot;
		String messageSansSucreEHot  = 	type+"h::" ;
		if ( sucre > 0 ) {
			messageAvecSucreEHot = 	type+"h:"+ sucre +":" + 0 ;
			return 	messageAvecSucreEHot;
		}
		    return messageSansSucreEHot ;
	}
	
	
	public static String payOrangeJuice(double amount, char drink) {

		double total = 	prix(amount, drink);
		
		if(total >= 0) {			
			return prepareOrangeJuice(drink);
			
		}else {
			return message + (total*(-1));
		}
	}
	
	
	public static String payDrinkEHot(double amount, char drink,int sugar, Boolean eH) {
		double total = 	prix(amount, drink);
		if(total >= 0) {			
			return prepareBoissonExtraHot(drink, sugar);	
		}else { 
			return message+ (total*(-1));
		}
	}


	public static String commandeColdDrink(double amount, char drink) {
		
		double total = prix(amount,drink);
		
		if(drink == 'O') {
			
		return	payOrangeJuice(amount, drink);
		}else {
	return message + (total *(-1));
		}
	}
	
	public static String commandeHotdrink(double amount, char drink,int sugar,Boolean eH ) {
		SecondeIteration makeDrink = new  SecondeIteration();
			if(eH == true) {	
			return	payDrinkEHot(amount, drink, sugar, eH);	
			}else{
				return makeDrink.payDrink(amount, drink, sugar);
				}
				}
	
	
	public static void main(String[] args) {
		System.out.println(commandeHotdrink(0.4, 'T',3,true ));
		System.out.println(commandeHotdrink(0.3, 'T',2,true ));
		System.out.println(commandeHotdrink(0.6, 'T',0,false));
		System.out.println(commandeHotdrink(0.4, 'T',0,true ));
		System.out.println(commandeHotdrink(0.3, 'H',0,true));
		System.out.println(commandeHotdrink(0.5, 'H',0,true));
		System.out.println(commandeHotdrink(0.6, 'H',1,true));
		System.out.println(commandeHotdrink(0.6, 'H',0,false));
		System.out.println(commandeHotdrink(0.6, 'C',0,false));
		System.out.println(commandeColdDrink(0.6, 'O'));
		System.out.println(commandeColdDrink(0.7, 'O'));
		System.out.println(commandeColdDrink(0.3, 'O'));
		
		
	}

}
