
public class Utility {
	
	final static String[] firstNames = {
            "John", "Jack", "Albert", "Bob", "Charlie", "Donald", "Elan", "Frank", "George", "Harry", "Ian", "Kevin", "Michael"
    };

    final static String[] lastNames = {
            "Adam", "Bill", "Crown", "Dixon", "Evans", "Fernando", "Gordon", "Hamilton", "Doe" ,"Joe","Puppy","Porter"
    };
    
	public Utility() {
		// TODO Auto-generated constructor stub
	}
	
	static java.util.Random rand = new java.util.Random();

    public static int GetRandom(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }
    
    public static String getRandomName(){
		int firstNameIndex = GetRandom(0,firstNames.length-1);
		int lastNameIndex = GetRandom(0,lastNames.length-1);
		return firstNames[firstNameIndex] + "." + lastNames[lastNameIndex];
    	
    }

}
