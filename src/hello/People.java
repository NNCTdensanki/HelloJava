package hello;

public class People {
	
	private String people;
	
	public People(int i){
		switch(i){
		case 0:
			people = "Alice";
			break;
		case 1:
			people = "Bob";
			break;
		case 2:
			people = "Chef";
			break;
		default:
			people = "Jun";
		}
	}

	public void greet() {
		System.out.println("Hello!"+people+"!");
	}
}
