package fst;

abstract class Human{
	
	private static int population = 0;
	
	public Human() {
		population++;
	}
	
	public static int getPopulation() {
		return population;
	}
	
	abstract void walking();
	abstract void talking();
}

class Boy extends Human{
	
	
	public void walking() {
		System.out.println("Boy is walking");
	}
	

	public void talking() {
		System.out.println("Boy is talking");
	}
	
}

class Girl extends Human{
	
	@Override
	public void walking() {
		System.out.println("Girl is walking");
	}
	
	@Override
	public void talking() {
		System.out.println("Girl is talking");
	}
	
}

class Robot{
	
	private static int count = 0;
	
	Robot(){
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	public void walking() {
		System.out.println("Robot is walking");
	}
	
	public void talking() {
		System.out.println("Robot is talking");
	}
	
}

public class Activity {

	public static void main(String[] args) {
		Boy boy1 = new Boy();
		Boy boy2 = new Boy();
		Boy boy3 = new Boy();
		Boy boy4 = new Boy();
		Boy boy5 = new Boy();
		
		Girl girl1 = new Girl();
		Girl girl2 = new Girl();
		Girl girl3 = new Girl();
		
		Robot robot1 = new Robot();
		Robot robot2 = new Robot();
		Robot robot3 = new Robot();
		Robot robot4 = new Robot();
		
		System.out.println("Population of Humans: " + Human.getPopulation() + "\nPopulation of Robots: "+ Robot.getCount());
	
		
	
	}
}
