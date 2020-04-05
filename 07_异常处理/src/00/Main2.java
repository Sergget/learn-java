import java.io.UnsupportedEncodingException;
import java.util.Arrays;
public class Main2 {
    public static void main(String[] args) {
        try {
            byte[] bs = toGBK("中文");
            System.out.println(Arrays.toString(bs));
        } catch (UnsupportedEncodingException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }

    static byte[] toGBK(String s) throws UnsupportedEncodingException{
        //方法将内部可能的exception抛出，交由上一级的try语句处理
        return s.getBytes("GBK");
    }
}