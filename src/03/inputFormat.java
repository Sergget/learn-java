import java.util.Scanner;

public class inputFormat{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input your name:");
        String name = input.nextLine();
        System.out.print("Input your age:");
        int age = input.nextInt();
        input.close();
        System.out.printf("Hi, %s, who is %d years old.",name,age);
   }
}