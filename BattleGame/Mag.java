package BattleGame;

public class Mag extends Character implements HealingSkills,ReinforcementSkills{
    int force;
  	int protection;
    int level;
    int status;

    public Mag(String name, int force, int protection, int level) {
        super(name);
        this.force = force;
        this.protection = protection;
        this.level = level;
        this.status = status;
    }

    public int getLevel() {
        return level;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }



    @Override
    public Integer countForce() {
        return force;
    }

    @Override
    public Integer countProtection() {
        return protection;
    }

    @Override
    public void heal(Character character) {
        int h = character.getHealth();
        if(h<100){
            character.setHealth(100);
        }
    }

    @Override
    public void heal(Character[] characters) {
        for(Character c : characters){
            int h = c.getHealth();
            if(h<100){
                c.setHealth(100);
            }
        }
    }

    @Override
    public void increaseForce(Superhero hero) {
        int f = hero.countForce();
        int l = this.getLevel();
        int newF = (int) (f+f*0.1*l);
        hero.setForce(newF);
    }

    @Override
    public void increaseForce(Superhero[] heroes) {
        int l = this.getLevel();
        for (Superhero hero : heroes){
            int f = hero.countForce();
            int newF = (int) (f+f*0.1*l);
            hero.setForce(newF);
        }
    }
    public void magAction( Character character){
        int stat = this.getStatus();
        if(stat == 1){
           this.fight(character);
        }else if(stat ==2){
            if(character.getHealth() == 100){
                System.out.println(" the "+character.name+" is healthy and not nead heal!");
                System.out.println("****************");
            }else {
                System.out.println("The Mag " + this.name + " heal " + character.name);
                System.out.println("Before healin the healt of " + character.name + " was " + character.getHealth() + " and now " +
                        "is: ");
                heal(character);
                System.out.println("and now is: " + character.getHealth());
                System.out.println("****************");
            }
        }else if(stat == 3){
            if(character.getClass() == Superhero.class) {
                System.out.println("The Mag " + this.name + " increase force of " + character.name + " from " + ((Superhero) character).countForce());
                this.increaseForce((Superhero) character);
                System.out.println(" to "+((Superhero) character).countForce());
                System.out.println("****************");
            }else {
                System.out.println("The Mag  can't increase force of "+character.name+" becouse it is EvilCrature!");
                System.out.println("****************");
            }
        } else if (stat == 4) {
            if(character.getClass() == Superhero.class){
                System.out.println("The Mag healt and increase force of "+character.name+".");
                if(character.getHealth() == 100) {
                    System.out.println(" the " + character.name + " is healthy and not nead heal!");
                    System.out.println("****************");
                }else {
                    System.out.println("The Mag " + this.name + " heal " + character.name);
                    System.out.println("Before healin the healt of " + character.name + " was " + character.getHealth() + " and now " +
                            "is: ");
                    heal(character);
                    System.out.println("and now is: " + character.getHealth());
                    System.out.println("****************");
                }
                System.out.println("The Mag " + this.name + " increase force of " + character.name + " from " + ((Superhero) character).countForce());
                this.increaseForce((Superhero) character);
                System.out.println(" to "+((Superhero) character).countForce());
                System.out.println("****************");
            }else {
                System.out.println("The Mag  can't increase force of "+character.name+" becouse it is EvilCrature!");
                System.out.println("But the Mag can healt "+character.name);
                if(character.getHealth() == 100){
                    System.out.println(" the "+character.name+" is healthy and not nead heal!");
                    System.out.println("****************");
                }else {
                    System.out.println("The Mag " + this.name + " heal " + character.name);
                    System.out.println("Before healin the healt of " + character.name + " was " + character.getHealth() + " and now " +
                            "is: ");
                    heal(character);
                    System.out.println("and now is: " + character.getHealth());
                    System.out.println("****************");
                }
            }
        }else {
            System.out.println("The Mag mast have status!");
            System.out.println("****************");
        }
    }
}
