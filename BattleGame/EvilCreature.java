package BattleGame;



public  class EvilCreature extends Character {
    private int force;
	private int protection;

     public EvilCreature(String name, int health, int force, int protection) {
         super(name, health,force);
         this.protection = protection;
     }

     @Override
     public Integer countForce() {
         return super.force;
     }

     @Override
     public Integer countProtection() {
         return protection;
     }

 }
