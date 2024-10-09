package BattleGame;

public class Weapon {
    public   String name;
	public   int force;

    public Weapon(String name, int force) {
        this.name = name;
        this.force = force;

    }


    public int getForce() {
        return force;
    }
}
