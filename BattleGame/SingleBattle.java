package BattleGame;




public class SingleBattle {
    public static void main(String[] args) {
         Weapon heroWeapon = new Weapon("M17", 5);
         Protection heroProtection= new Protection("armor",3);
         EvilCreature evil = new EvilCreature("Sauron",100,7,50);
         Superhero hero = new Superhero(" Hulk",100, 4,heroWeapon,heroProtection );
         hero.fight(evil);
    }
}
