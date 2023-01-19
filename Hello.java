import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.print("Please write something thet you what to be wtiten to the screen -> ");
		String input = sc.nextLine();
		System.out.println("Hello class!" + input);
		System.out.println("What a wonderfull day!");
	}
}