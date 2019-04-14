
public class Card{
	
String testdeck3; 
String rank; 

	
    Card (String suit, String rank)
    {
        this.suit = suit;
        this.rank = rank;
    }
   	
   public String getsuit() { 
   	return this.suit; 
   }
   public String getrank() { 
	   	return this.rank; 
	   }
   
   
    public void print ()
  
    {
        System.out.println(this.suit +this.rank);
    }
    
}


