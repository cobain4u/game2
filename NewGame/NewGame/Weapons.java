import java.awt.ActiveEvent;
public class Weapons extends Character{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int amoCapacity;
private int  damage;
private int bullets;

//////////////setting the constructors/////////
public Weapons() {
	this.amoCapacity=10;
	this.damage=0;
    this.bullets=amoCapacity;
  

}
public int getAmoCapacity() {
return amoCapacity;
}

public int getBullets() {
return bullets;



}
	
public void loadWeapon(int numberOfBullets)	{
if(numberOfBullets>amoCapacity) {
int load= amoCapacity-this.getBullets();	
amoCapacity=load;
System.out.println("your amo is full");
}
else {	

System.out.println("Amo:"+" "+ numberOfBullets);
}
}

public int getDamage() {
	return damage;
}

public void setDamage(int amountOfDamage) {
    Character a=new Character();
	int newHealth=100-amountOfDamage;
	if(newHealth<amountOfDamage&&newHealth==0) {
		System.out.println("you died dumbass");
	}
		else if(newHealth<amountOfDamage) {
		  a.recieveDamage(10);
		 System.out.println("you took a hit  your new health is"+newHealth );
		 
		
		
		}
	
	
	
}
public void pistolDamage(int pistolDamage) {

	if(pistolDamage<=10) {
	
	this.setHealth(this.getHealth()-damage);
	}
}
}





















