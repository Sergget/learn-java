import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String origin = "中文！";
        String encoded = URLEncoder.encode(origin,StandardCharsets.UTF_8);
        String decoded = URLDecoder.decode(encoded,StandardCharsets.UTF_8);
        System.out.println("Encoded text from: "+origin +" is "+encoded);
        System.out.println("Decoded text from: "+encoded+" is "+decoded);
    }
}