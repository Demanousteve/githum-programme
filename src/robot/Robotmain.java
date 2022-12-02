package robot;
import java.util.Scanner;

public class Robotmain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot R1 = new Robot();
		Robot R2 = new Robot();
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer le nom du robot 1");
		R1.setNom(sc.next());
		System.out.println("entrer le nom du robot 2");
		R2.setNom(sc.next());
		
		Arena arena = new Arena();
		arena.fight(R1, R2);
	}

} 
