import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        String origin = "中文！";
        String encoded = URLEncoder.encode(origin,StandardCharsets.UTF_8);
        String decoded = URLDecoder.decode(encoded,StandardCharsets.UTF_8);
        System.out.println("Encoded text from "+origin +" is "+encoded);
        System.out.println("Decoded text from "+encoded+" is "+decoded);

        String origin2 = "5letters";
        byte[] decodedB64 = Base64.getDecoder().decode(origin2);
        String encodedB64 = Base64.getEncoder().encodeToString(decodedB64);
        System.out.println("Decoded Base64 for "+origin2+" is "+ Arrays.toString(decodedB64));
        System.out.println("Encoded Base64 for "+decodedB64+" is " + encodedB64);
    }
}