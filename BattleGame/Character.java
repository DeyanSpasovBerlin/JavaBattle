package BattleGame;

public abstract class Character {
    String name;
	 int health = 100;
     int force ;

    public Character(String name, int health, int force) {
        this.name = name;
        this.health = health;
        this.force = force;
    }

    public void introduce(){
        System.out.println(" I am "+name+" an I have health "+getHealth());

     }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public  abstract Integer countForce();


    public  abstract Integer countProtection();


    public void  fight(Character another){
        Integer force1 = this.countForce();
        Integer anotherForce = another.countForce();
        if(force1> anotherForce){
            System.out.println(" Winer is "+this.name+"\n");
            Integer resultHealth =
                    (int) (another.getHealth() - 1.0*(this.countForce()-another.countForce())/another.countProtection());
            System.out.println(another.name+" Health: "+another.getHealth());
            System.out.println(this.name+ " Force: "+this.countForce());
            System.out.println(another.name+" Force: "+another.countForce());
            System.out.println(another.name+" Protection: "+another.countProtection());
            //System.out.println(((another.getHealth() + "+" + 1.0 + "*(" + this.countForce()) + "-") + another
            // .countForce() + ")/" + another.countProtection());
            System.out.println(another.name+" resultHealth: "+resultHealth);
            System.out.println(" Health "+another.name+" decrise from "+another.health+" to "+resultHealth);
            another.setHealth(resultHealth);
        } else if (force1 == anotherForce) {
            System.out.println("Batle end without winner!\n");
            System.out.println("The health of "+this.name+" is "+this.getHealth()+" and the health of "+another.name+" is "+another.getHealth());
        }else {
            System.out.println(" The winner is "+another.name);
            Integer  resultHealth = this.getHealth() - (another.countForce()-this.countForce())/this.countProtection();
            System.out.println(" Health "+this.name+" decrise from "+this.health+" to "+resultHealth);
            this.setHealth(resultHealth);
        }
    }

}
