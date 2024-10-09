package BattleGame;

import java.util.*;

public class ChoisMethod   {//implements Equipment
    Random rand = new Random();
   // Scanner reader = new Scanner(System.in);
    Equipment equip;

    Superhero hero1 = new Superhero("Volverin", 100, 8);
    Superhero hero2 = new Superhero("SuperMario", 100, 3);
    Superhero hero3 = new Superhero("Sonic", 100, 8);
    Superhero hero4 = new Superhero("MasterChief", 100, 11);
    Superhero hero5 = new Superhero("LaraCroft", 100, 7);

    Superhero[] heroes = new Superhero[]{hero1, hero2, hero3, hero4, hero5};
    ArrayList<Superhero> heroesList = new ArrayList<Superhero>();
    ArrayList<Superhero> choosevHeroesList = new ArrayList<Superhero>();

    Protection protection1 = new Protection("Helmet", 4);
    Protection protection2 = new Protection("Hazard", 2);
    Protection protection3 = new Protection("WildWood", 3);
    Protection protection4 = new Protection("LodeStoyn", 1);
    Protection protection5 = new Protection("SuitArms", 5);

    Protection[] protections = new Protection[]{protection1, protection2, protection3, protection4, protection5};
    ArrayList<Protection> protectionList = new ArrayList<Protection>();
    ArrayList<Protection> choosenProtectionList = new ArrayList<Protection>();

    Weapon weapon1 = new Weapon("AK47", 7);
    Weapon weapon2 = new Weapon("M17", 5);
    Weapon weapon3 = new Weapon("Catana", 1);
    Weapon weapon4 = new Weapon("Bow", 2);
    Weapon weapon5 = new Weapon("Bomb", 9);

    Weapon[] weapons = new Weapon[]{weapon1, weapon2, weapon3, weapon4, weapon5};
    ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
    ArrayList<Weapon> choosenWeaponList = new ArrayList<Weapon>();

    EvilCreature evil1 = new EvilCreature("Cruella", 100, 9, 55);
    EvilCreature evil2 = new EvilCreature("MotherBrain", 100, 3, 65);
    EvilCreature evil3 = new EvilCreature("Magneto", 100, 7, 45);
    EvilCreature evil4 = new EvilCreature("Allian", 100, 8, 47);
    EvilCreature evil5 = new EvilCreature("Predator", 100, 6, 39);

    EvilCreature[] evils = new EvilCreature[]{evil1, evil2, evil3, evil4, evil5};
    ArrayList<EvilCreature> evilList = new ArrayList<EvilCreature>();
    ArrayList<EvilCreature> choosevEvilsList = new ArrayList<EvilCreature>();


    int bufer = 0;
//    public void chooseEquioment() {
//
//    }

    // на основание  обычного масива героев делает лист масив
    public ArrayList<Superhero> setSuperheroList() {
        for (Superhero a : heroes) {
            heroesList.add(a);
        }
        return heroesList;
    }

    public AbstractList<Protection> seProtectiontSuperheroList() {
        for (Protection a : protections) {
            protectionList.add(a);
        }
        return protectionList;
    }

    public AbstractList<Weapon> setWeapontSuperheroList() {
        for (Weapon a : weapons) {
            weaponList.add(a);
        }
        //heroesProtectionVieu(protectionList);
        return weaponList;
    }

    public AbstractList<EvilCreature> setEvilist() {
        for (EvilCreature a : evils) {
            evilList.add(a);
        }
        return evilList;
    }


    public void heroesProtectionView(ArrayList<Protection> protList) {
        int i = 1;
        for (Protection b : protList) {
            System.out.println(i + " name: " + b.name + " level: " + b.getLevel());
            i++;
        }
    }

    public void heroesWeaponView(ArrayList<Weapon> weapList) {
        int i = 1;
        for (Weapon b : weapList) {
            System.out.println(i + " name: " + b.name + " level: " + b.getForce());
            i++;
        }
    }

    public void printSuperheroList(ArrayList<Superhero> hr) {
        int i = 1;
        for (Superhero b : hr) {
            System.out.println("\t" + i + " \tname: " + b.name + " \tforce: " + b.getInnerForce());
            i++;
        }
    }

    public void printSuperheroProtectionList(ArrayList<Superhero> hr) {
        int i = 1;
        for (Superhero b : hr) {
            System.out.println("\t" + i + " \tname: " + b.name + " \tforce: " + b.getInnerForce() + " \tarmour: " + b.protection.name + " \tlevel " +
                    "of protection: " + b.countProtection());
            i++;
        }
    }

    public void printSuperheroProtectionWeaponList(ArrayList<Superhero> hr) {
        int i = 1;
        for (Superhero b : hr) {
            System.out.println("\t" + i + " \tname: " + b.name + " \tforce: " + b.getInnerForce() + " \tarmour: " + b.protection.name + " \tlevel " +
                    "of protection: " + b.countProtection() + "\t weapon: " + b.weapon.name+ "\t weapon force: " + b.weapon.force + "\t total force: " + b.countForce());
            i++;
        }
    }

    public void printEvilList(ArrayList<EvilCreature> hr) {
        int i = 1;
        for (EvilCreature b : hr) {
            System.out.println("\t" + i + " \tname: " + b.name + "         \tforce: " + b.countForce()+" \tlevel of " +
                    "protection: "+ b.countProtection());
            i++;
        }
    }


    //клонирует начальной масив героев что бы рабожтать с клоном и не менят оригинала
    public ArrayList<Protection> cloneProtection(ArrayList<Protection> arrlist) {
        ArrayList<Protection> cloneProtectionList = (ArrayList) arrlist.clone();
        return cloneProtectionList;
    }

    public ArrayList<Weapon> cloneWeapon(ArrayList<Weapon> arrlist) {
        ArrayList<Weapon> cloneWeaponList = (ArrayList) arrlist.clone();
        return cloneWeaponList;
    }

    public ArrayList<Superhero> cloneCreature(ArrayList<Superhero> arrlist) {
        ArrayList<Superhero> cloneArrList = (ArrayList) arrlist.clone();
        return cloneArrList;
    }

    public ArrayList<EvilCreature> cloneEvilCreature(ArrayList<EvilCreature> arrlist) {
        ArrayList<EvilCreature> cloneArrList = (ArrayList) arrlist.clone();
        return cloneArrList;
    }


    //возвращает начальной масив героев
    public ArrayList getHeroesList() {
        return heroesList;
    }

    public ArrayList getProtectionList() {
        return protectionList;
    }

    public ArrayList<Weapon> getWeaponList() {
        return weaponList;
    }

    public ArrayList<EvilCreature> getEvilList() {
        return evilList;
    }


    public <showMenu> Integer getKundenChoisNum(ArrayList arrList) {
        //showMenu(arrList);//for test purpuse
        Scanner reader = new Scanner(System.in);
        Integer length = arrList.size();
        Integer chois = null;
        while (true) {
            String s = reader.nextLine();
            if (Objects.equals(s.toUpperCase(), "R")) {
                chois = rand.nextInt(1, (length + 1));
                break;
            } else if (Objects.equals(s.toUpperCase(), "E")) {
                //flag = 88;//exit hero choose
                chois = 88;
                break;
            } else if (Objects.equals(s.toUpperCase(), "N")) {
                //flag = 99;//new game
                chois = 99;
                break;
            } else if (Objects.equals(s.toUpperCase(), "X")) {
                System.out.println("GoodBye");
                System.exit(0);//exit application
            } else if (Integer.valueOf(s) > 0 && Integer.valueOf(s) < (length + 1)) {
                chois = Integer.valueOf(s);
                break;
            } else if ((Integer.valueOf(s) < 1 && Integer.valueOf(s) > (length)) || !(Objects.equals(s.toUpperCase(),
                    "X")) || !(Objects.equals(s.toUpperCase(), "R")) || !(Objects.equals(s.toUpperCase(), "E") || !(Objects.equals(s.toUpperCase(), "N"))))
                System.out.println("Please insert only legal chois !");
            continue;
        }
        //System.out.println("chois= " + chois + " flag= " + chois);//for test purpuse
        return chois;
    }

    public void showMenu(ArrayList arrList) {//главное меню для выбора героев
        System.out.println("\nChoose option: \tSuperhero №:   \tR Random    \tE. Exit Creature   \tN. New game   \tX" +
                ".Quit aplication\n");
        printSuperheroList(arrList);
    }

    public void showMenuProtection(ArrayList arrList) {//главное меню для выбора protection
        System.out.println("\nChoose option: \tArmour №:   \tR Random    \tE. Exit Armour   \tN. New game   \tX" +
                ".Quit aplication\n");
        heroesProtectionView(arrList);
    }

    public void showMenuWeapon(ArrayList arrList) {//главное меню для выбора weapon
        System.out.println("\nChoose option: \tWeapon №:   \tR Random    \tE. Exit Weapon   \tN. New game   \tX" +
                ".Quit aplication\n");
        heroesWeaponView(arrList);
    }

    public void showMenuEvilCreature(ArrayList arrList) {//главное меню для выбора EvilCreature
        System.out.println("\nChoose option: \tEvilCreature №:   \tR Random    \tE. Exit EvilCreature   \tN. New game   \tX" +
                ".Quit aplication\n");
        printEvilList(arrList);
    }



    public ArrayList<Superhero> reduceSuperheroList(ArrayList arrlist1, ArrayList arrlist2, ArrayList arrlist3) {
        setSuperheroList();
        ArrayList cloneCreature = cloneCreature(arrlist1);
        seProtectiontSuperheroList();
        ArrayList cloneProtectionList = cloneProtection(arrlist2);
        setWeapontSuperheroList();
        ArrayList cloneWeaponList = cloneWeapon(arrlist3);
        while (true) {
            int length = cloneCreature.size();
            if (length == 0) {
                System.out.println("You  choose all possible Creatures! ");
                break;
            }
            showMenu(cloneCreature);
            int index =(Integer) getKundenChoisNum(cloneCreature);
            if (index == 88) {
                System.out.println("You abort Creature choosen");
                bufer = index;
                break;
            } else if (index == 99) {
                bufer = index;
                System.out.println("You choose new game.");
                break;
            }
            choosevHeroesList.add((Superhero) cloneCreature.get((index - 1)));
            cloneCreature.remove(index - 1);
            System.out.println("\nUp to now You choose next Creature:\n");
            printSuperheroList(choosevHeroesList);

            //***********в етом блоке каждому герою добавляем protection
            showMenuProtection(cloneProtectionList);
            int indexProtection = getKundenChoisNum(cloneProtectionList);
            if (indexProtection == 88) {
                bufer = indexProtection;
                System.out.println("You abort Creature choosen");
                break;
            } else if (indexProtection == 99) {
                bufer = indexProtection;
                System.out.println("You choose new game.");
                break;
            }
            choosenProtectionList.add((Protection) cloneProtectionList.get((indexProtection - 1)));
            choosevHeroesList.getLast().setProtection((Protection) cloneProtectionList.get((indexProtection - 1)));
            cloneProtectionList.remove(indexProtection - 1);
            System.out.println("\nUp to now You choose next Creature:\n");
            printSuperheroProtectionList(choosevHeroesList);

            //***********в етом блоке каждому герою добавляем weapon
            showMenuWeapon(cloneWeaponList);
            int indexWeapon = getKundenChoisNum(cloneWeaponList);
            if (indexWeapon == 88) {
                bufer = indexWeapon;
                System.out.println("You abort Creature choosen");
                break;
            } else if (indexWeapon == 99) {
                bufer = indexWeapon;
                System.out.println("You choose new game.");
                break;
            }
            choosenWeaponList.add((Weapon) cloneWeaponList.get((indexWeapon - 1)));
            choosevHeroesList.getLast().setWeapon((Weapon) cloneWeaponList.get((indexWeapon - 1)));
            cloneWeaponList.remove(indexWeapon - 1);
            System.out.println("\nUp to now You choose next Superhero:\n");
            printSuperheroProtectionWeaponList(choosevHeroesList);
            continue;
        }
        if (bufer == 88) {//abort choos
            //System.out.println("bufer= " + bufer);
            // some action
            System.out.println("Your final choose is:");
            printSuperheroProtectionWeaponList(choosevHeroesList);
            return choosevHeroesList;
        } else if (bufer == 99) //new game
            //System.out.println("bufer= " + bufer);
            // some action
            System.out.println(" Chose from the begining!");
            return arrlist1;

    }

    public ArrayList<EvilCreature> reduceEvilList(ArrayList arrlist) {
        Scanner reader = new Scanner(System.in);
        setEvilist();
        ArrayList cloneEvilList = cloneEvilCreature(arrlist);
        while (true) {
            int length = cloneEvilList.size();
            if (length == 0) {
                System.out.println("You  choose all possible Creatures! ");
                break;
            }
            showMenuEvilCreature(cloneEvilList);
            int index = getKundenChoisNum(cloneEvilList);
            if (index == 88) {
                System.out.println("You abort EvilCreature choosen");
                bufer = index;
                break;
            } else if (index == 99) {
                bufer = index;
                System.out.println("You choose new game.");
                break;
            }
            choosevEvilsList.add((EvilCreature) cloneEvilList.get((index - 1)));
            System.out.println("Choose if "+((EvilCreature) cloneEvilList.get((index - 1))).name+" is angry or not:");
            while (true){
                System.out.println("\t Is angry: Y       \tIs not angry:  N");
                String s = reader.nextLine();
                if (Objects.equals(s.toUpperCase(), "Y")) {
                    bufer = choosevEvilsList.getLast().countForce();
                    choosevEvilsList.getLast().setAngry(true);
                    System.out.println("The force of "+choosevEvilsList.getLast().name+" " +
                            "increase double. Old force is "+bufer+" and new force is "+choosevEvilsList.getLast().countForce());
                    break;
                }else if(Objects.equals(s.toUpperCase(), "N")) {
                    System.out.println("The force of "+choosevEvilsList.getLast().name+" not change" +
                            " and  is: "+choosevEvilsList.getLast().countForce());
                    break;
                }else {
                    System.out.println("Insert only 'Y' or 'N' !");
                    continue;
                }
            }
            cloneEvilList.remove(index - 1);
            System.out.println("\nUp to now You choose next EvilCreature:\n");
            printEvilList(choosevEvilsList);
            continue;
        }
        if (bufer == 88) {//abort choos
            //System.out.println("bufer= " + bufer);
            // some action
            System.out.println("Your final choose is:");
            printEvilList(choosevEvilsList);
            return choosevEvilsList;
        } else if (bufer == 99) //new game
            //System.out.println("bufer= " + bufer);
            // some action
            System.out.println(" Chose from the begining!");
            return arrlist;


    }

    // здесь каждий Superhero вступает в битву с каждий EvilCreatures
    public void figtEvilsHeroes(ArrayList<Superhero> heroesList,ArrayList<EvilCreature> evisList){
        for (Superhero hero : heroesList){
            for (EvilCreature evil : evisList){
                System.out.println("The fight between "+hero.name+" and "+evil.name+"\n=>=>=>=>=>=>\n");
                hero.fight(evil);
            }
        }
    }

    //здесь проверяем что масив heroe и EvilCreatures не пустой. Если пустой выходим из игры. Есле нет битва каждого
    // heroe с каждого EvilCreatures. После битвы выбор новую игру с новой выбор участников или exit
    public void finalFight(ArrayList arrlist1, ArrayList arrlist2, ArrayList arrlist3,ArrayList arrlist4) {
        Scanner reader = new Scanner(System.in);
        Integer flag = 0;
        Integer choisNum = 0;
        while (true) {
            ArrayList<Superhero> sup =   reduceSuperheroList(arrlist1, arrlist2, arrlist3);
            ArrayList<EvilCreature> ev  = reduceEvilList(arrlist4);
//            System.out.println("reduceSuperheroList(arrlist1, arrlist2, arrlist3\n");
//            printSuperheroProtectionWeaponList(sup);
//            reduceSuperheroList(arrlist1, arrlist2, arrlist3).removeAll(reduceSuperheroList(arrlist1, arrlist2, arrlist3));
//            System.out.println("reduceEvilList(arrlist4)\n");
//            printEvilList(ev);
//            reduceEvilList(arrlist4).removeAll(reduceEvilList(arrlist4));


            if (sup.size() == 0) {
                System.out.println("You not set heroes. The game over!");
                System.exit(0);
            } else if (ev.size() == 0) {
                System.out.println("You not set evils. The game over!");
                System.exit(0);
            }
//            printSuperheroProtectionWeaponList(reduceSuperheroList(arrlist1, arrlist2, arrlist3));
//            printEvilList(reduceEvilList(arrlist4));//все герои и евил участвующие в игры в полном формате
            while (true) {
                System.out.println("\t1. Fight     \t2. Exit");
                choisNum = reader.nextInt();
                if (choisNum != 1 && choisNum != 2) {
                    System.out.println("Insert 1 or 2!");
                    continue;
                } else if (choisNum == 1) {
                    figtEvilsHeroes(sup, ev);
                    break;
                } else {
                    System.out.println("GoodBye");
                    System.exit(0);
                }
                break;
            }
            choisNum = 0;
            while (true) {
                System.out.println("\t1. New Game     \t2. Exit");
                choisNum = reader.nextInt();
                if (choisNum == 1) {
                    flag = 1;
                    heroesList.removeAll(heroesList);
                    protectionList.removeAll(protectionList);
                    weaponList.removeAll(weaponList);
                    evilList.removeAll(evilList);
                    break;
                } else if (choisNum == 2) {
                    System.out.println("GoodBye");
                    System.exit(0);
                } else {
                    System.out.println("Inser 1 or 2!");
                    continue;
                }
                break;
            }
            if ((flag == 1)) {
                continue;
            }
            break;
        }
    }
}


/*
//    public AbstractList<Superhero> reduceSuperheroList1(ArrayList arrlist){
//        cloneCreature(arrlist);
//        System.out.println("\n*****************\n");
//        int length = arrlist.size();
//        if (length == 0) {
//            System.out.println("GoodBye");
//            System.exit(0);
//        }
//        System.out.println("heroesList.size()=  "+arrlist.size());
//        printSuperheroList(arrlist);
//        int index = rand.nextInt(0,length);
//        System.out.println("\nrand.nextInt= "+index+"\n");
//        choosevHeroesList.add((Superhero) arrlist.get(index));
//        arrlist.remove( index);
//        System.out.println("nheroesList:\n");
//        printSuperheroList(arrlist);
//        System.out.println("choosevHeroesList:\n");
//        printSuperheroList(choosevHeroesList);
//        System.out.println("\nheroesList.size()=  "+arrlist.size());
//        System.out.println("\n*****************\n");
//        return arrlist;
//    }

 */
//    public void printProtectionList(ArrayList<Protection> hr){
//        int i =1;
//        for (Protection b: hr){
//            //System.out.print("\t"+i+" \tname: "+b.name+"\t force: "+b.getInnerForce());
//            System.out.println(i+" name: "+b.name+" force: "+b.getLevel());
//            i++;
//        }
//    }



