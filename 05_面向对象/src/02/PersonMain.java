public class PersonMain {
    public static void main(String[] args) {
        // DONE: 给Person增加构造方法:
        Person ming = new Person("小明", 12);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }
}
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person (String name,int age){
        this.name = name;
        this.age = age;
    }
}