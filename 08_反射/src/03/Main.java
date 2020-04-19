import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射调用setName和setAge方法:

		Method mSetName = Person.class.getMethod("setName",String.class);
		Method mSetAge = Person.class.getMethod("setAge",int.class);

		mSetName.invoke(p, name);
		mSetAge.invoke(p, age);

		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}