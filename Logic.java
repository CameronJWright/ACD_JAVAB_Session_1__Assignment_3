package hello.world;
import java.util.Scanner;

public class Logic {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("First number, 0 or 1: ");
		int x = scan.nextByte();
		System.out.println("Second number, 0 or 1: ");
		int y = scan.nextByte();
		Boolean a;
		Boolean b;
		
		if(x>0) {
			a = true;
		} else {
			a = false;
		}
		
		if(y>0) {
			b = true;
		} else {
			b = false;
		}
		
		System.out.println("Logic : " + (a && b));
		System.out.println("Bitwise : " + (x & y));
		
	
	}

}
