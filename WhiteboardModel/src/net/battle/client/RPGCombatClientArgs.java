package net.battle.client;

import net.battle.PlayerJob;
import net.battle.RPGCombat;

import java.util.Arrays;

class RPGCombatClientArgs {


    public static void main(String[] args) {
        if (args.length < 3) {
            String usage = "Usage: java net.battle.client.RPGCombatClientArgs <playerName> <attackName> <job>";
            String example = "Example: java net.battle.client.RPGCombatClientArgs Cloud,  CrossSlash, Warrior";
            String note1 = "Create a player name";
            String note2 = "Create an attack name of one word or more words with camelcase";
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