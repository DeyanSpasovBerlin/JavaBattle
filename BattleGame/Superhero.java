package BattleGame;



public class Superhero extends Character {
    int force;
    Weapon weapon ;//= new Weapon("Kala69nikov",7);
    Protection protection; //= new Protection("armor",3);
    public Superhero(String name, int health, int force,  Weapon weapon, Protection protection) {
        super(name, health, force);
        this.weapon = weapon;
        this.protection = protection;
    }

    public Superhero(String name, int health, int force) {
        super(name, health, force);

    }

    public void setForce(int force) {
        this.force = force;
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }
    public Integer getInnerForce(){
        return super.force;
    }

    @Override
    public Integer countForce() {
        return weapon.getForce()+super.force;
    }

    @Override
    public Integer countProtection() {
        return protection.getLevel();
    }

}


