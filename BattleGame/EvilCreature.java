package BattleGame;



public  class EvilCreature extends Character {
    private int force;
	private int protection;
    private boolean isAngry;

     public EvilCreature(String name, int health, int force, int protection) {
         super(name);
         this.protection = protection;
         this.force = force;
     }



    public void setForce(int force) {
        this.force = force;
    }

    @Override
     public Integer countForce() {
        if (this.isAngry) {
            return 2 * this.force;
        }
        return this.force;
    }

     @Override
     public Integer countProtection() {
         return protection;
     }

    public void setAngry(Boolean angry) {
        isAngry = angry;
    }
}
