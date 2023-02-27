package net.battle;

import java.time.*;

/**
 * JR: Demonstrates understanding of program concepts, with a few improvements needed.
 * Client throws unhandled exception, and minor improvements needed in ClientArgs.
 * Validation testing is perfect.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted.
 *
 * Class participation is adequate, and has improved recently, keep it up.
 *
 * Class names, package names, and overall structure are correct.
 *
 * Better class name here might be just Player, as an "RPGCombat" object
 * is more complex, involving several Players, battles, etc.
 */
public class RPGCombat {

    // JR: better naming might be MIN/MAX_DAMAGE, as I don't see any real "interval" here
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

    /*
     * JR: IntelliJ gave you fully-qualified class names in here when you placed the classes
     * in packages, which might have been better off adjusted to better strings:
     *  RPGCombat for the leading class name (vs. net.battle.RPGCombat)
     *  job for the label of PlayerJob (vs. net.battle.PlayerJob)
     *
     * A 'battleComplete' value is provided here, even if this object never battled.
     *  See bottom of main() method in RPGCombatClient for a demo of this.
     *
     * Don't include the "\n" when *returning* a string via String.format(),
     * only when printing yourself via printf().
     */
    public String toString() {
        return String.format("net.battle.RPGCombat: damageInterval= %s, attackName= %s, playerName= %s, net.battle.PlayerJob= %s, battleComplete= %s\n",
                getDamageInterval(), getAttackName(), getPlayerName(), getJob(), getBattleComplete());
    }
}
