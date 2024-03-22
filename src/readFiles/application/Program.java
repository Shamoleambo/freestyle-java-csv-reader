package readFiles.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Provide the path of the file to be written");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//			br.lines().map(line -> line.split(","))
		} catch (Exception e) {
			sc.close();
		}

	}

}
