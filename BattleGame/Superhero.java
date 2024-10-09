package BattleGame;



public class Superhero extends Character {
    private int force;
    Weapon weapon ;//= new Weapon("Kala69nikov",7);
    Protection protection; //= new Protection("armor",3);
    public Superhero(String name, int health, int force,  Weapon weapon, Protection protection) {
        super(name);
        this.weapon = weapon;
        this.protection = protection;
        this.force = force;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Superhero(String name, int i, int force) {
        super(name);
        this.force = force;

    }
    //    public Superhero(String name, int health) {
//        super(name, health);
//
//    }

    public void setForce(int force) {
        this.force = force;
    }

    public Protection getProtection() {
        return protection;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }
    public Integer getInnerForce(){
        return this.force;
    }

    @Override
    public Integer countForce() {
        return weapon.getForce()+this.force;
    }

    @Override
    public Integer countProtection() {
        return protection.getLevel();
    }

}


