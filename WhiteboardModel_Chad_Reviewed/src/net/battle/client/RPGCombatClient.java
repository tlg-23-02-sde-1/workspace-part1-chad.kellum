package net.battle.client;

import net.battle.DamageCalculator;
import net.battle.PlayerJob;
import net.battle.RPGCombat;

/*
 * JR: crashes with java.lang.StackOverflowError at the call to DamageCalculator.randomInt(),
 * must not have been tested.  See comments in DamageCalculator.
 */
class RPGCombatClient {

    public static void main(String[] args) {
        RPGCombat p1 = new RPGCombat("Cloud");
        p1.setAttackName("Cross Slash");

        // JR: nothing is done with this local variable 'damage'
        // and this call crashes the application, due to flaw in DamageCalculator.
        // JR: I commented out this call, so I could see the rest of it.
        //  int damage = DamageCalculator.randomInt();
        p1.setJob(PlayerJob.WARRIOR);

        RPGCombat p2 = new RPGCombat("Vivi", "Flare", PlayerJob.BLACK_MAGE);
//        p2.setPlayerName("Vivi"); // coded before constructors
//        p2.setAttackName("Flare");

        RPGCombat p3 = new RPGCombat("Sabin", "Suplex", 7777, PlayerJob.MONK);
//        p3.setPlayerName("Sabin");  // Coded previously
//        p3.setAttackName("Suplex");
//        p3.setDamageInterval(9999);

        RPGCombat p4 = new RPGCombat("Yshtola", "Holy", PlayerJob.WHITE_MAGE);

        System.out.println("Random Encounter!!! Time to battle.");
        System.out.println();
        p1.battleTurn();
        p2.battleTurn();
        p3.battleTurn();
        p4.battleTurn();

        System.out.println(); // blank line

        p1.combatVictory();
        p2.combatVictory();
        p3.combatVictory();
        p4.combatVictory();

        System.out.println(); // blank line

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


        // JR: I added this, to show that 'test' has a value for 'battleComplete' printed,
        // but has actually never battled.
        System.out.println();
        RPGCombat test = new RPGCombat("Jay");
        System.out.println(test);
    }
}
