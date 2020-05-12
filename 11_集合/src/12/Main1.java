// 转十六进制
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        String hex = toHex(12500);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }
    }

    static String toHex(int n) {
        Deque<String> hexStack = new LinkedList<>();
        String s = "ABCDEF";
        while (n!=0) {
            if(n%16>9){
                // hexStack.push(s.get(n%16-9));
            }else{
                // hexStack.push(String.valueOf(n%16));
            }
            n=n/16;
        }
        return String.valueOf(n);
    }
}