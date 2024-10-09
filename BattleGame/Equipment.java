package BattleGame;

import java.util.ArrayList;

public interface Equipment {



    default void heroWeaponView(Weapon[] weapons){
        int i = 1;
        System.out.println("\tName of the weapon: \tForce of the weapon: \n");

        for (Weapon a : weapons) {
            System.out.print(+i + "    " + a.name + "                     " + a.force + "\n");
            i++;
        }
    }

    default void heroesProtectionVieu(Protection[] protections) {
        int i = 1;
        System.out.println("\tName of the armour: \tLevel of the protection: \n");
        for (Protection a : protections) {
            System.out.print(+i + "    " + a.name + "                     " + a.level + "\n");
            i++;
        }
    }
}
