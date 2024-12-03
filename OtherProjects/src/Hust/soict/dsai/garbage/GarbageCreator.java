package Hust.soict.dsai.garbage;

import java.util.Scanner;

public class GarbageCreator {
	public void createGarbage() {
		for (int i = 1; i < 100001; i++) {
			Object garbage = new Object();
			System.out.print("Created <garbage>"+i+"</garbage>");
		}
	}
	
	public static void main(String[] args) {
		GarbageCreator bin = new GarbageCreator();
		bin.createGarbage();
		
		Scanner scanner = new Scanner(System.in);
		String ans;

		while(true) {
			System.out.println( "Clean garbage? \"Y\" or \"N\"");
			ans = scanner.nextLine();

			if (ans.toLowerCase().equals("y")) {
				NoGarbage cleaner = new NoGarbage();
				bin = null;
				cleaner.cleanUpGarbage();
			} else if (ans.toLowerCase().equals("n")) {
				break;
			}
		}
		
		scanner.close();
	}
}