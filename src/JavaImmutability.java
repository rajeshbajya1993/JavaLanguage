import java.util.HashMap;
import java.util.Iterator;

/**
 * Declare the class as final so it can’t be extended.
 * Make all fields private so that direct access is not allowed.
 * Don’t provide setter methods for variables
 * Make all mutable fields final so that it’s value can be assigned only once.
 * Initialize all the fields via a constructor performing deep copy.
 * Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
 * 
 * https://www.journaldev.com/129/how-to-create-immutable-class-in-java
 * @author rbajya
 *
 */


public final class JavaImmutability {
	private final int id;
	private final HashMap<String,String> hash;
	
   public JavaImmutability(int id,HashMap<String,String> hash1){
	   this.id=id;
//	   this.hash=(HashMap<String, String>)hash.clone();
	   
	   // 1. Copy elements of hash1 and put one by one in hash
	   // 2. if we do, this.hash=hash1, any changes done in hash1 will be reflected in hash as well
	   //  becuase they both are poiniting to same object.
	   // Instead create a new hashmap with elements from hash1
	   // and never give reference of this newly created hash, instead return clone.
	   // To copy we can use  hash.putAll(hash1) as well
	   
	   hash = new HashMap<>();
	   Iterator<String> it = hash1.keySet().iterator();
	   while(it.hasNext()){
		   
		   String ptr = it.next();  		  
		   hash.put(ptr, hash1.get(ptr));
	   }
	  
   }
   public int getId(){
	   return id;
   }
   public HashMap<String,String> getMap(){
	   //never return instance of hash,instead return a copy of hash
	   HashMap<String,String> has = new HashMap<>();
	   has.putAll(hash);
	   return has;
   }
	public static void main(String[] args) {
		HashMap<String,String> hash1 = new HashMap<>();
		hash1.put("Rajesh", "bajya");
		hash1.put("suresh", "bhakar");
		JavaImmutability ji = new JavaImmutability(12, hash1);
		System.out.println(ji.getMap());
		ji.getMap().put("hello", "naam");
		System.out.println(ji.getMap());
		hash1.put("RAM","RAM SA");
		System.out.println(ji.getMap());
		ji.hash.put("Hello", "rajesh");
		System.out.println(ji.getMap());

	}
	/**
	 * Can you create an immutable object having following functionality
	 * 
	 * public class{
	 *    String name;
	 *    HashMap<String,String> hash;
	 *    public String getName();
	 *    public Map<String,String> getMap();
	 * }
	 */

}
