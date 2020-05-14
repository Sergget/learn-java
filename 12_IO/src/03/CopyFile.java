import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.err.println("Usage:\n  java CopyFile.java <source> <target>");
			System.exit(1);
		}
		copy(args[0], args[1]);
	}

	static void copy(String source, String target) throws IOException {
		// 友情提示：测试时请使用无关紧要的文件
		// TODO:
		try(InputStream input = new FileInputStream(source)){
			byte[] buffer =new byte[1000];
			int n;
			while((n=input.read(buffer))!=-1){
				System.out.println(buffer.toString());
				// try(OutputStream output =new FileOutputStream(target)){
				// 	output.write(buffer.toString().getBytes("UTF-8"));
				// }
			}
		}
	}
}