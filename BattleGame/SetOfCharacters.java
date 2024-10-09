package BattleGame;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SetOfCharacters implements Equipment{
    Scanner reader = new Scanner(System.in);
    Random rand = new Random();

    Superhero hero1 = new Superhero("Volverin", 100, 8);
    Superhero hero2 = new Superhero("SuperMario", 100, 3);
    Superhero hero3 = new Superhero("Sonic", 100,8);
    Superhero hero4 = new Superhero("MasterChief", 100,11);
    Superhero hero5 = new Superhero("LaraCroft", 100,7);

    Character evil1 = new EvilCreature("Cruella", 100, 9, 55);
    Character evil2 = new EvilCreature("MotherBrain", 100, 3, 65);
    Character evil3 = new EvilCreature("Magneto", 100, 7, 45);
    Character evil4 = new EvilCreature("Allian", 100, 8, 47);
    Character evil5 = new EvilCreature("Predator", 100, 6, 39);

    Protection protection1 = new Protection("Helmet", 4);
    Protection protection2 = new Protection("Hazard", 2);
    Protection protection3 = new Protection("WildWood", 3);
    Protection protection4 = new Protection("LodeStoyn", 1);
    Protection protection5 = new Protection("SuitArms", 5);

    Weapon weapon1 = new Weapon("AK47",7);
    Weapon weapon2 = new Weapon("M17", 5);
    Weapon weapon3 = new Weapon("Catana", 1);
    Weapon weapon4 = new Weapon("Bow", 2);
    Weapon weapon5 = new Weapon("Bomb", 9);

    Superhero[] heroes = new Superhero[]{hero1, hero2, hero3, hero4, hero5};
    Character[] evils = new Character[]{evil1, evil2, evil3, evil4, evil5};
    Protection[] protections = new Protection[]{protection1, protection2, protection3, protection4, protection5};
    Weapon[] weapons = new Weapon[]{weapon1,weapon2,weapon3,weapon4,weapon5};
    ArrayList<Superhero> heroesList = new ArrayList<Superhero>();
    ArrayList<Character> evisList = new ArrayList<Character>();

    Integer chois = 0;
    Integer length = heroes.length;



    public void heroView() {
        int i = 1;
        System.out.println("\tName of the hero: \tForce of the hero:  \t6.Random chois   7. Exit!");
        for (Superhero a : heroes) {
            System.out.print(+i + "    " + a.name + "                " + a.getInnerForce() + "\n");
            i++;
        }
    }
    public void evilView() {
        int i = 1;
        System.out.println("\tName of the evil:     \tForce:   \t Protection:  \t6.Random chois  7. Exit!");
        for (Character a : evils) {
            System.out.print(+i + " " + a.name + "      " + a.countForce()+"     "+a.countProtection()+"\n");
            i++;
        }
    }

    public void evilListView() {
        int i = 1;
        System.out.println("\tName of the evil:     \tForce:   \t Protection:  ");
        for (Character a : evisList) {
            System.out.print(+i + " " + a.name + "      " + a.countForce()+"     "+a.countProtection()+"\n");
            i++;
        }
    }

    public void heroesListView() {
        int i = 1;
        System.out.println("\tName of the hero: \tForce of the hero: ");
        for (Superhero a : heroesList) {
            System.out.print(+i + "    " + a.name + "                " + a.getInnerForce() + "\n");
            i++;
        }
    }
    public void heroesListViewProtection() {
        int i = 1;
        System.out.println("\tName of the hero: \tForce of the hero: \t Protection of the Hero:");
        for (Superhero a : heroesList) {
            System.out.print(+i + "    " + a.name + "                " + a.getInnerForce() +" " +
                    "                  "+a.protection.name+" " +a.countProtection()+"\n");
            i++;
        }
    }

    public void heroesListViewProtectionWeapon() {
        int i = 1;
        System.out.println("\tName of the hero: \tForce: \t Protection :\tWeapon:  \tSummary force:");
        for (Superhero a : heroesList) {
            System.out.print(+i + "    " + a.name + "           " + a.getInnerForce() +"  " +
                    "           "+a.protection.name+" " +a.countProtection()+"  "+a.weapon.name+":" +
                    " "+a.weapon.force+"              "+a.countForce()+"\n");
            i++;
        }
    }
// все пересено в интерфейс Equipment
    //*************
//    public void heroesProtectionVieu() {
//        int i = 1;
//        System.out.println("\tName of the armour: \tLevel of the protection: \n");
//        for (Protection a : protections) {
//            System.out.print(+i + "    " + a.name + "                     " + a.level + "\n");
//            i++;
//        }
//    }
//    public void heroWeaponView(){
//        int i = 1;
//        System.out.println("\tName of the weapon: \tForce of the weapon: \n");
//        for (Weapon a : weapons) {
//            System.out.print(+i + "    " + a.name + "                     " + a.force + "\n");
//            i++;
//        }
//    }
//*****************

    //кунден выбирает число от 1 до 5 - ето соответсвует или Superhero или Weapon или Protection или EvilCreature
    // если выбирает 6 выходим из меню
    public Integer getKundenChoisNum(String whatKundenChooses,Integer length) {
        Integer chois = null;
        while (true) {
            System.out.println(whatKundenChooses);
            chois = reader.nextInt();
            if(chois == (length+1)){
                chois = getrRandomNumber(length);
                break;
            }
            if (chois > 0 && chois < (length + 3)) {
                break;
            }else
                System.out.println("Please insert numbers from 1 to "+(length+2)+" !");
                continue;
            }
        return chois;
    }

    //проверяем что число которое выбрал кунден уже не было выбронное. Если да, сообщение выбрать другое число. Если
    // нет добавляем Superhero или Weapon или Protection или EvilCreature в ArrayList<Integer> arrList
    // если выбирает 6 выходим из меню
    public Integer verificationChois(ArrayList<Integer> arrList, Integer[] arr, String whatKundenChooses, Integer length){
        Integer bufer = 0;
        //Boolean flag = true;
        while (true) {
            bufer = getKundenChoisNum(whatKundenChooses,length);
            if (bufer == (length+2)) {
                break;
            }
            if (arrList.contains(bufer)) {
                System.out.println("Please inser the number diferent from: " + bufer);
                continue;
            } else {
                arrList.add(bufer);
                break;
            }
        }
        return bufer;
    }
    //кунден выбирает от 1 до 5 героев. Сразу как выбрал герой добаляет ему weapo  и protection. Когда выбирает 6
    // выходит из меню выбора героев и начинает выбирать EvilCreature
    public ArrayList<Superhero> kundenHeroesListArr(Integer length) {
        // в етот масив храним superhero которыи выбирает кунден
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Integer[] arr = new Integer[length];
        String whichHeroKundenChooses = "Insert the heroes for the game:\n";

        // в етот масив храним Protection для superhero которыи выбирает кунден
        ArrayList<Integer> arrListProtection = new ArrayList<Integer>();
        Integer[] arrProtection = new Integer[length];
        String whatProtectionKundenChooses = "Please inser the armour for the hero:";

        // в етот масив храним Weapon для superhero которыи выбирает кунден
        ArrayList<Integer> arrListWeapon = new ArrayList<Integer>();
        Integer[] arrWeapon = new Integer[length];
        String whichWeaponKundenChooses = "Please inser the weapon for the hero:";

        for (int i = 1; i < length+1; i++) {
            heroView();//показывает 5 Heroes в формате name  InnerForce
            Integer bufer =  verificationChois(arrList,arr,whichHeroKundenChooses,length);//получаем число от 0 до 4
            // которое не повторяеться
            if(bufer==length+2){// выход
                break;
            }
            switch (bufer){
                case 1 ->{
                    heroesList.add(hero1);
                }
                case 2 ->{
                    heroesList.add(hero2);
                }
                case 3 ->{
                    heroesList.add(hero3);
                }
                case 4 ->{
                    heroesList.add(hero4);
                }
                case 5 ->{
                    heroesList.add(hero5);
                }
            }
            System.out.println("Up to now You choose next heroes: ");
            heroesListView();//все superhero выбранные до етого момента, с name  InnerForce без Weapon без Protection
            heroesProtectionVieu(protections);// показывает все 5 возможные Protection
            bufer = verificationChois(arrListProtection,arrProtection,whatProtectionKundenChooses,length);//получаем
            // число от 1 до 5 которое не повторяеться. Если 6 - рандом число, если 7 ехит
            if(bufer==(length+2)){
                break;
            }
            heroesList.getLast().setProtection(protections[bufer-1]);
            System.out.println("Up to now You choose next heroes: ");
            heroesListViewProtection();
            heroWeaponView(weapons) ;
            bufer = verificationChois(arrListWeapon,arrWeapon,whichWeaponKundenChooses,length);
            if(bufer==(length+2)){// выход
                break;
            }
            heroesList.getLast().setWeapon(weapons[bufer-1]);// к последнему superhero которой выбрал кунден добавляем Weapon
            //*********************
            System.out.println("Up to now You choose next heroes: ");
            heroesListViewProtectionWeapon();//показывает выбранные до етого момента heroes в формате name
            // InnerForce protection Weapon innerForce+ WeaponForce
            continue;
        }
        System.out.println(" Your final set of heroes: ");// когда кунден выбрал все гоерои или Вышел из меню выбора
        // героев
        heroesListViewProtectionWeapon();
        return heroesList;
    }

    //кунден выбирает от 1 до 5 EvilCreature.  Когда выбирает 6
    // выходит из меню выбора EvilCreature и можеть выбрать начало игры или exit
    public ArrayList<Character> kundenEvilssListArr(Integer length) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Integer[] arr = new Integer[length];
        String whichEvilKundenChooses = "Insert the evils for the game:\n";
        for (int i = 1; i < length+1; i++) {
            evilView();
            Integer bufer =  verificationChois(arrList,arr,whichEvilKundenChooses,length);//получаем число от 0 до 4
            // которое не повторяеться
            if(bufer==length+2){
                break;
            }
            switch (bufer){
                case 1 ->{
                    evisList.add(evil1);
                }
                case 2 ->{
                    evisList.add(evil2);
                }
                case 3 ->{
                    evisList.add(evil3);
                }
                case 4 ->{
                    evisList.add(evil4);
                }
                case 5 ->{
                    evisList.add(evil5);
                }
            }
            System.out.println("Up to now You choose next EvilCreatures: ");
            evilListView();//список EvilCreatures выбранные до етого момента в формате name
            // InnerForce protection
            continue;
        }
        System.out.println(" Your final set of evils: ");
       evilListView();//список EvilCreatures окончательно  выбранные для игры в формате name
        // InnerForce protection
        return evisList;
    }

        // здесь каждий Superhero вступает в битву с каждий EvilCreatures
    public void figtEvilsHeroes(ArrayList<Superhero> heroesList,ArrayList<Character> evisList){
        for (Superhero hero : heroesList){
            for (Character evil : evisList){
                hero.fight(evil);
            }
        }
    }

    //здесь проверяем что масив heroe и EvilCreatures не пустой. Если пустой выходим из игры. Есле нет битва каждого
    // heroe с каждого EvilCreatures. После битвы выбор новую игру с новой выбор участников или exit
    public void setCharacters() {
        Integer flag = 0;
        while (true) {
            kundenHeroesListArr(length);
            if (heroesList.size() == 0) {
                System.out.println("You not set heroes. The game over!");
                System.exit(0);
            }
            kundenEvilssListArr(length);
            if (evisList.size() == 0) {
                System.out.println("You not set evils. The game over!");
                System.exit(0);
            }
            heroesListViewProtectionWeapon();
            evilListView();//все герои и евил участвующие в игры в полном формате
            while (true) {
                System.out.println("\t1. Fight     \t2. Exit");
                chois = reader.nextInt();
                if (chois != 1 && chois != 2) {
                    System.out.println("Inser 1 or 2!");
                    continue;
                } else if (chois == 1) {
                    figtEvilsHeroes(heroesList, evisList);
                    break;
                } else {
                    System.out.println("GoodBye");
                    System.exit(0);
                }
            }
            while (true) {
                System.out.println("\t1. New Game     \t2. Exit");
                chois = reader.nextInt();
                if (chois == 1) {
                    flag = 1;
                    break;
                } else if (chois == 2) {
                    System.out.println("GoodBye");
                    System.exit(0);
                } else {
                    System.out.println("Inser 1 or 2!");
                    continue;
                }
            }
            if ((flag == 1)){
                continue;
            }
        }
    }
    //    choose random number (0<=>4)

    public Integer getrRandomNumber(Integer length){
        //Integer randomNumber = rand.nextInt(0,(length-1));
        ArrayList<Integer> nonRepeateRandomNumberList = new ArrayList<Integer>();
        Integer[] nonRepeateRandomNumber = new Integer[length];
        Integer bufer ;
        //for (int i = 0; i < nonRepeateRandomNumber.length; i++) {
            while (true){
                bufer = rand.nextInt(1, (length+1));
                if(nonRepeateRandomNumberList.contains(bufer)){
                    continue;
                }else {
                    nonRepeateRandomNumberList.add(bufer);
                    nonRepeateRandomNumber = nonRepeateRandomNumberList.toArray(nonRepeateRandomNumber);
                    break;
                }
            }
        //System.out.println("bufer= "+bufer);
            return bufer;
        //}
        //System.out.println(Arrays.toString(nonRepeateRandomNumber));
        //return nonRepeateRandomNumber;

    }
}



