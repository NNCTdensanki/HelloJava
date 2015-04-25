package hello;

import java.util.Random;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("Hello,World!");
		
		Random r = new Random();
		int i = r.nextInt(4);
		
		People p = new People(i);
		p.greet();
	}
}
