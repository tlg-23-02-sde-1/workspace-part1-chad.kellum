package net.battle;

import java.time.*;


public class RPGCombat {

    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 9999;

//----------STATICS ABOVE--------------------------------------

    //FIELDS
    private String playerName;
    private String attackName;
    private Integer damageInterval = DamageCalculator.randomInt(MIN_INTERVAL, MAX_INTERVAL);
    private PlayerJob job;


    //BUSINESS METHODS

    // CONSTRUCTORS

    public RPGCombat() {
    }

    public RPGCombat(String playerName) {
        setPlayerName(playerName);
    }

    public RPGCombat(String playerName, String attackName) {
        this(playerName);
        setAttackName(attackName);
    }

    public RPGCombat(String playerName, String attackName, PlayerJob job) { // If no specific damage given but job given
        this(playerName, attackName);
        setJob(job);

    }

    public RPGCombat(String playerName, String attackName, Integer damageInterval) { // If an attack has specific damage
        this(playerName, attackName);
        setDamageInterval(damageInterval);

    }

    public RPGCombat(String playerName, String attackName, Integer damageInterval, PlayerJob job) {
        this(playerName, attackName, damageInterval);
        setJob(job);
    }


    // ACCESSORS
    public void battleTurn() {
        System.out.printf("%s, the %s's turn. They choose %s. It does %s damage to the target.\n", getPlayerName(),
                getJob(), getAttackName(), getDamageInterval());
    }

    public void combatVictory() {
        System.out.printf("The enemy is defeated by %s at %s. Fanfare plays and the team is victorious!\n",
                getPlayerName(), getBattleComplete());
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getDamageInterval() {
        return damageInterval;
    }

    public void setDamageInterval(int damageInterval) {
        if (damageInterval >= MIN_INTERVAL && damageInterval <= MAX_INTERVAL) {
            this.damageInterval = damageInterval;
        } else {
            System.out.println("Invalid damage interval " + damageInterval +
                    ". The attack was ineffective. The damage can only be within the range " + MIN_INTERVAL +
                    "-" + MAX_INTERVAL);
        }
    }

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public PlayerJob getJob() {
        return job;
    }

    public void setJob(PlayerJob job) {
        this.job = job;
    }

    public LocalTime getBattleComplete() {
        return LocalTime.now().withNano(0);
    }


    public String toString() {
        return String.format("net.battle.RPGCombat: damageInterval= %s, attackName= %s, playerName= %s, net.battle.PlayerJob= %s, battleComplete= %s\n",
                getDamageInterval(), getAttackName(), getPlayerName(),
                getJob(), getBattleComplete());
    }
}
