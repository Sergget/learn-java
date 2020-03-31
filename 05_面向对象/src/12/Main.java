import java.beans.*;

import javax.management.Descriptor;

public class Main{
    public static void main(String[] args) throws Exception{
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        for(PropertyDescriptor pd:info.getPropertyDescriptors()){
            System.out.println(pd.getName());
            System.out.println("  " + pd.getReadMethod());
            System.out.println("  " + pd.getWriteMethod());
        }
    }
}

class Person{
    private String Name;
    private int age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}