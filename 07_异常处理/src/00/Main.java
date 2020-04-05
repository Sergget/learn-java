import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s){
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            //必须捕获getBytes抛出的UnsupportedEncodingException，否则编译报错
            System.out.println(e);
            return s.getBytes();
        }
    }
}