package entities;

public class bill {
	
	public  char gender;
	public  int beer;
	
	public  int barbecue;
	public int softDrink;
	
	public  double cover() {
		if ((feeding ()) < 30) {
			return 4.00;
		} else {
			return 0.00;
		}
		
	}
	
    public  double feeding() {
    	return (beer * 5) + (softDrink * 3)+ (barbecue * 7);
    }
    public  double ticket() {
    	if(gender == 'F') {
			return    8;
		} else {
			return  10;
		}
    	
    }
    public  double total() {
    	return (ticket () + feeding () + cover ());
 }
}
