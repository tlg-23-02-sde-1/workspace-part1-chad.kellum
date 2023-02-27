package net.battle.test;

import net.battle.RPGCombat;

/*
 * JR: perfect.
 */
class RPGCombatValidationTest {

    public static void main(String[] args) {

        RPGCombat damageInterval = new RPGCombat();

        damageInterval.setDamageInterval(1);
        System.out.println("The damage interval is " + damageInterval.getDamageInterval());

        damageInterval.setDamageInterval(9999);
        System.out.println("The damage interval is " + damageInterval.getDamageInterval());

        damageInterval.setDamageInterval(0);
        damageInterval.setDamageInterval(10000);
        System.out.println("The damage interval is " + damageInterval.getDamageInterval());
    }
}