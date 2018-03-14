
public class Utility {
	
	final static String[] firstNames = {
            "John", "Jack", "Albert", "Bob", "Charlie", "Donald", "Elan", "Frank", "George", "Harry", "Ian", "Kevin", "Michael"
    };

    final static String[] lastNames = {
            "Adam", "Bill", "Crown", "Dixon", "Evans", "Fernando", "Gordon", "Hamilton", "Doe" ,"Joe","Puppy","Porter"
    };
    

	
	static java.util.Random rand = new java.util.Random();

    public static int GetRandom(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }
    
    public static String getRandomName(){
		int firstNameIndex = GetRandom(0,firstNames.length-1);
		int lastNameIndex = GetRandom(0,lastNames.length-1);
		return firstNames[firstNameIndex] + "." + lastNames[lastNameIndex];
    	
    }
    
    public boolean compare(String a, String b){
		boolean x;
		if(a==b)
			x=true;
		else 
			x=false;
		return x;
    	//return (a==b)?true:false;
    	//return a==b;
    	
    }
    
    public static char getRank(int number){
    	char rank = 0;
    	
    	if (90<=number && number<=100)	
    		rank = 'A';
    	else if (80<=number && number<90)	
    		rank = 'B';
    	else if (70<=number && number<80)	
    		rank = 'C';
    	else if (60<=number && number<70)	
    		rank = 'D';
    	else 
    		rank = 'F';
    	
    	return rank;
    }
    

}
