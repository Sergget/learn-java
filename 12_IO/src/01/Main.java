import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		File currentDir = new File(".");
		System.out.println("Please input target directory(default current dir):");
		Scanner inputLine=new Scanner(System.in);
		String inputDir = inputLine.nextLine();
		inputLine.close();
		listDir(inputDir.isEmpty()?currentDir.getCanonicalFile():new File(inputDir));
	}

	static void listDir(File dir) {
		// TODO: 递归打印所有文件和子文件夹的内容
		class filePrinter{
			void recPrinter(File dir,int levelCounter){
				File[] fs = dir.listFiles();
				if (fs != null) {
					for (File f : fs) {
						if(f.isDirectory()){
							System.out.println(indent(levelCounter)+f.getName()+"/");
							levelCounter++;
							recPrinter(f,levelCounter);
							levelCounter--;
						}else{
							System.out.println(indent(levelCounter)+f.getName());
						}
					}
				}
			}
		}
		filePrinter fp= new filePrinter();
		fp.recPrinter(dir,0);
	}

	static String indent(int n){
		String indentationSymbol = "  ";
		var sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(indentationSymbol);
		}
		return n==0?"":sb.append("+-").toString();
	}
}