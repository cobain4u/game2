import java.util.Scanner;

public class GameTester  {

	

	
	
	
	public static void main(String[]args) {



Game game=new Game("new game",600,800);
game.start();

Scanner scanner=new Scanner(System.in);
System.out.print("Hi new player!" +" "+" please enter a Name!");
Character newUser=new Character();
newUser.setName(scanner.nextLine());
System.out.println("hi!"+" " +":"+ " " + newUser);
newUser.setHealth(100);

Weapons gun=new Weapons();
gun.loadWeapon(11);
newUser.recieveDamage(10);
System.out.println("your health is:"+" " +newUser.getHealth());

Weapons pistol=new Weapons();
pistol.pistolDamage(0);
   
	}

}
