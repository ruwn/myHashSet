package list;

public class Main {

	public static void main(String[] args) {
		Month jan = new Month("Januar");
		Month feb = new Month("Februar");
		Month mae = new Month("März");
		Month apr = new Month("April");
		
		
		MyHashSet mySet = new MyHashSet();
		mySet.add(jan);
		mySet.add(jan);
		mySet.add(jan);
		mySet.add(feb);
		mySet.add(mae);
		mySet.add(apr);
		
		System.out.println(mySet.toString());
	}

}
