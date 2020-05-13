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
        List<String> hexList= List.of("A","B","C","D","E","F");
        while (n!=0) {
            hexStack.push(n%16>9?hexList.get(n%16-10):String.valueOf(n%16));
            n=n/16;
        }
        String result="";
        while(!hexStack.isEmpty()){result=result+hexStack.pop();}
        return result;
    }
}