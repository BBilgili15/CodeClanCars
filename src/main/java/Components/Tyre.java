package Components;


import Constants.Season;

public class Tyre {
    private Season season;
    private boolean wornOut;

    public Tyre(Season season, boolean wornOut) {
        this.season = season;
        this.wornOut = wornOut;
    }
}
