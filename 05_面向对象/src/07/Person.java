
public class Person {

	// TODO

	String name;

	public Person(String name) {
		this.name = name;
		count++;
	}

	protected static int count;

	public static int getCount(){
		return count;
	}

}
