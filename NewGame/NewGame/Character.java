//: setting up the class Character 
public class  Character  {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name;
protected int health;
private int damage;
private Boolean sex;

public Character()
{
	this.name="new Character";
	this.health=0;
	damage=0;
	this.sex=false;
}

public String getName()
{
name="default";
return name;
}
public void setName(String newName) {

this.name=newName;

}






public String toString() {


return "your character is "+ name;//"\n" +"health:"+(damage-health)+ "\n" + "damage:" +" "+ damage;
	
}


public int getHealth() {
int currentHealth=health-damage;
health=currentHealth;
return health;

}
public void setHealth(int currentHealth) {
health=currentHealth;
if (health<=0) {

System.out.println("you died!");

}
else {

	currentHealth=this.getDamage()-health;
	//System.out.println(" Your Current Health is:"+ " " + health);

}
}
public int getDamage(){
this.damage=0;
return damage;
}

public void recieveDamage(int amountOfDamage) {
	
	int newHealth=this.getHealth()-amountOfDamage;
    this.setHealth(newHealth);
	health=newHealth;
	if(amountOfDamage>health) {
	
    newHealth=health-amountOfDamage;
	this.setHealth(newHealth);
  
//newHealth=this.getHealth()-amountOfDamage;
	
		this.setHealth(newHealth);
	 System.out.println("you took a hit! your new health is "+" " + health);
		if(amountOfDamage>health||amountOfDamage<0) {
			//newHealth=this.getHealth()-amountOfDamage;
        Character newPlayer=new Character();
        	newPlayer.changeHealth();
		    
            System.out.println("you died!");
	
	}
	}
//newDamage=amountOfDamage+damage;
}
 

private void changeHealth() {
	   int foo=0;
	   int[]newHealth=new int[100];
	   int[] currentHealth=new int[this.getHealth()];
	  if(damage<health)
	   for(int i=0;foo<newHealth.length;i++) {

	newHealth[0]=this.getHealth()-this.getDamage();
		currentHealth[10]=newHealth[100];
	   }
	 // System.out.println( currentHealth[10]) ;
	}

}





	
		

	









