package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Path: ");
		String path = sc.nextLine();
		
		File file = new File(path);
		File[] listFolders = file.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS:");
		for (File folder : listFolders) {
			System.out.println(folder);
		}
		
		File[] listFiles = file.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File files : listFiles) {
			System.out.println(files);
		}
		
		sc.close();

	}

}
