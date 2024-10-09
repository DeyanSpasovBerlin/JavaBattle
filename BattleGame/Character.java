package BattleGame;

public abstract class Character {
    String name;
	 int health = 100;
    //int force ;

    public Character(String name) {
        this.name = name;
        //this.health = health;
        //this.force = force;
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
        System.out.println("Fight "+this.name+" agains "+another.name+" :");
        Integer force1 = this.countForce();
        Integer anotherForce = another.countForce();
        Integer bufer;
        if(force1> anotherForce){
            System.out.println(" Winer is "+this.name);
            System.out.println(" Defeater is "+another.name);
            bufer = another.getHealth();
            Integer resultHealth =
                    (int) (another.getHealth() - 1.0*(this.countForce()-another.countForce())/another.countProtection());
            System.out.println("Defeater "+another.name+" Health befor fight: "+another.getHealth());
            System.out.println("Winner "+this.name+ " have Force: "+this.countForce());
            System.out.println("Winner "+this.name+ " have Protection: "+this.countProtection());
            System.out.println("Winner "+this.name+ " have Health: "+this.getHealth());
            System.out.println("Defeater "+another.name+" have Force: "+another.countForce());
            another.setHealth(resultHealth);
            System.out.println("Defeater "+another.name+" have Protection: "+another.countProtection());
            System.out.println("Defeater: "+another.name+" Health after fight: "+another.getHealth());
            System.out.println("Defeater Health "+another.name+" decrise from "+bufer+" to "+another.getHealth());
            bufer = 0;
            System.out.println("****************");
        } else if (force1 == anotherForce) {
            System.out.println("Batle end without winner!\n");
            System.out.println("The health of "+this.name+" is "+this.getHealth()+" and the health of "+another.name+" is "+another.getHealth());
            System.out.println("****************");
        }else {
            bufer = this.getHealth();
            System.out.println(" The winner is "+another.name);
            System.out.println(" Defeater is "+this.name);
            Integer  resultHealth =
                    (int)(this.getHealth() - (double)(another.countForce()-this.countForce())/this.countProtection());
            System.out.println("Defeater "+this.name+" Health befor fight: "+this.getHealth());
            System.out.println("Winner "+another.name+ " have Force: "+another.countForce());
            System.out.println("Winner "+another.name+ " have Protection: "+another.countProtection());
            System.out.println("Winner "+another.name+ " have Health: "+another.getHealth());
            System.out.println("Defeater "+this.name+" have Force: "+this.countForce());
            this.setHealth(resultHealth);
            System.out.println("Defeater "+this.name+" have Protection: "+this.countProtection());
            System.out.println("Defeater: "+this.name+" Health after fight: "+this.getHealth());
            System.out.println(" Health "+this.name+" decrise from "+bufer+" to "+this.getHealth());
            bufer = 0;
            System.out.println("****************");
        }
    }
}
