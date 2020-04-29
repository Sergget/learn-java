import  java.util.Arrays;

public class Main{
   public static void main(String[] args) {
       Person[] ps = new Person[]{
            new Person("Bob",12),
            new Person("Jerry",16),
            new Person("Fan",18)
       };
       Arrays.sort(ps);
       System.out.println(Arrays.toString(ps));
   } 
}

class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public int compareTo(Person o){
        return this.name.compareTo(o.name);
    }

    public String toString(){
        return this.name+","+this.age;
    }
}