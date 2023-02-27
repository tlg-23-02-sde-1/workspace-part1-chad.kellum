package net.battle.client;

import net.battle.PlayerJob;
import net.battle.RPGCombat;

import java.util.Arrays;

/*
 * JR: works as intended, but a few improvements needed.
 * See comments below.
 */
class RPGCombatClientArgs {


    public static void main(String[] args) {
        if (args.length < 3) {
            String usage = "Usage: java net.battle.client.RPGCombatClientArgs <playerName> <attackName> <job>";

            // JR: command line inputs are space-delimited, not comma-delimited
            // Should be Cloud CrossSlash Warrior
            String example = "Example: java net.battle.client.RPGCombatClientArgs Cloud,  CrossSlash, Warrior";

            String note1 = "Create a player name";
            String note2 = "Create an attack name of one word or more words with camelcase";

            // JR: more care needed here, since toString() has been overridden in PlayerJob.
            // Application prints the following in the usage banner:
            //  Supported jobs are [Warrior, Paladin, Black Mage, White Mage, Monk, Thief, Summoner, Dragoon, Red Mage]
            //
            // BUT if the user wants a Red Mage, it must type "Red Mage" on the command line, since command line
            //  inputs are space-delimited.
            String note3 = "Choose a job. Supported jobs are " + Arrays.toString(PlayerJob.values());

            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;
        }
        System.out.println("You provided " + args.length + " arguments");

        String playerName = args[0];
        String attackName = args[1];
        PlayerJob job = PlayerJob.valueOf(args[2].toUpperCase());

        RPGCombat player = new RPGCombat(playerName, attackName, job);
        System.out.println("Congratulations on choosing a character!");
        System.out.println("Your character is now ready to battle!");
        System.out.println(player);

    }
}