package Coffe;

public class FirstIteration {

	public static  String prepareBoisson(char type, int sucre) {
		String messageAvecSucre;
		String messageSansSucre  = 	type+"::" ;
		
		if ( sucre > 0 ) {
			messageAvecSucre = 	type+":"+ sucre +":" + 0 ;
			return 	messageAvecSucre;
		}

		return messageSansSucre ;
		
	}

	public static void main(String[] args) {
	System.out.println(prepareBoisson('T',2 ));
	System.out.println(prepareBoisson('C',1 ));
	System.out.println(prepareBoisson('H',0 ));

	}

}
