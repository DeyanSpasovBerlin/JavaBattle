package BattleGame;




public class SingleBattle {
    public static void main(String[] args) {
         Weapon heroWeapon = new Weapon("M17", 5);
         Protection heroProtection= new Protection("armor",3);
         EvilCreature evil = new EvilCreature("Sauron",100,7,50);
         Superhero hero = new Superhero(" Hulk",100, 8,heroWeapon,heroProtection );

        Boolean flag = false;
        evil.setAngry(flag);
         hero.fight(evil);

         flag = true;
        evil.setAngry(flag);
        hero.fight(evil);

        Mag mag = new Mag("Astor",9,12,41);
        mag.setStatus(1);
        mag.magAction(evil);
        mag.setStatus(2);
        mag.magAction(evil);
        mag.setStatus(3);
        mag.magAction(evil);
        mag.setStatus(4);
        mag.magAction(evil);
        mag.magAction(hero);
        mag.setStatus(1);
        mag.magAction(hero);
    }

}

