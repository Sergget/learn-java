import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws Exception{
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射给name和age字段赋值:
		Field fName=p.getClass().getDeclaredField("name");
		Field fAge=p.getClass().getDeclaredField("age");

		fName.setAccessible(true);
		fAge.setAccessible(true);

		fName.set(p,name);
		fAge.set(p,age);

		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}