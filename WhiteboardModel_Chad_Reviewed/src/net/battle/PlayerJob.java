package net.battle;

public enum PlayerJob {
    WARRIOR("Warrior"),
    PALADIN("Paladin"),
    BLACK_MAGE("Black Mage"),
    WHITE_MAGE("White Mage"),
    MONK("Monk"),
    THIEF("Thief"),
    SUMMONER("Summoner"),
    DRAGOON("Dragoon"),
    RED_MAGE("Red Mage");

    private final String display;

    // Constructor - called only from inside (9 times, from those listed above)
    PlayerJob(String display) {
        this.display = display;
//        System.out.println("net.battle.PlayerJob ctor called");
    }

    public String display() {  // often the "get" prefix is omitted when there is no setter
        return display;
    }

    public String toString() {
        return display();
    }

}