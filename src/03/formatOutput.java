import java.security.Principal;

public class formatOutput{
    public static void main(String[] args) {
        double d=3.1415926;
        int i=123450;
        System.out.printf("%.2f\n",d);
        System.out.printf("%d\n",i);
        System.out.printf("hex=%08x\n", i);
        System.out.println(String.format("%1$,09d", -3123));
        System.out.println(String.format("%1$9d", -31));
        System.out.println(String.format("%1$-9d", -31));
        System.out.println(String.format("%1$(9d", -31));
        System.out.println(String.format("%1$#9x", 5689));
    }
}