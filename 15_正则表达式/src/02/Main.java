public class Main {
    public static void main(String[] args) {
        String re = "learn\\s((j|J)ava|(p|p)hp|(g|G)o)";
        System.out.println("learn java".matches(re));
        System.out.println("learn Java".matches(re));
        System.out.println("learn php".matches(re));
        System.out.println("learn Go".matches(re));
    }
}