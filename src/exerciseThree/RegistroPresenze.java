package exerciseThree;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import exerciseOne.Main;

public class RegistroPresenze {

	private static File file = new File("presenze.txt");
	
	static String user001 = "Mario, 10";
	static String user002 = "Luigi, 8";
	static String user003 = "Wario, 18";
	static String user004 = "Princess Peach, 56";
	
	
	public static void main(String[] args) {
		try {
			save(user001);
			save(user002);
			save(user003);
			save(user004);
			System.out.print(read());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void save(String string) throws IOException{
		FileUtils.writeStringToFile(file, string + System.lineSeparator(), "UTF-8", true);
	}
	
	public static String read() throws IOException{
		if(file.exists()) {
			String presenze = FileUtils.readFileToString(file, "UTF-8");
			return presenze;
		} else {
			Main.logger.error("FILE NOT FOUND");
			return "";
		}
	}
}
