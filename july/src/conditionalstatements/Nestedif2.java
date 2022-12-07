package conditionalstatements;

public class Nestedif2 {public static void main(String[] args) {
	int meal=1;
	int drink=2;
	if (meal==1) {
	System.out.println("you can have breakfst");
	if(meal<=0&&meal>=-1) {System.out.println("you can have lunch");		
	}	
	else {System.out.println("you cant have meal");}
	if(drink==2) {System.out.println("you can drink");}
	else{System.out.println("you cannot have drink");		
	}		
			}
			else {System.out.println("otherwise you need to stay empty stomach");

}
}
}