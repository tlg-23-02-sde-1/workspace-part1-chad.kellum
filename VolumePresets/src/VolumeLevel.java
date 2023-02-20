enum VolumeLevel {
    OFF(0),
    SOFT(25),
    MEDIUM(50),
    LOUD(75),
    MAX(100);


    private Integer loudness;

    public Integer getVolumeLevel() {
        return loudness;
    }

    public void setVolumeLevel(Integer volumeLevel) {
        this.loudness = volumeLevel;
    }

    VolumeLevel(Integer volumeLevel){
        this.loudness = volumeLevel;


    }
}
