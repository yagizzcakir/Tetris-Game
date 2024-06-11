package tetris.utilities.colorscheme;

public class Scheme {

    private static Scheme instance = new Scheme();

    protected Scheme() {
    }

    public String getLightBlue() {
        return "#4fc3f7";
    }

    public String getDarkBlue() {
        return "#00006f";
    }

    public String getOrange() {
        return "#cc8400";
    }

    public String getYellow() {
        return "#E4D00A";
    }

    public String getGreen() {
        return "#00b300";
    }

    public String getRed() {
        return "#bc0000";
    }

    public String getMagenta() {
        return "#990099";
    }

    public String getGray() {
        return "#808080";
    }

    public static Scheme getInstance() {
        return instance;
    }

    public static Scheme getScheme(String scheme) {
        switch (scheme) {
            case "Coral":
                return Coral.getInstance();
            case "Desert":
                return Desert.getInstance();
            case "Forest":
                return Forest.getInstance();
            case "Neon":
                return Neon.getInstance();
            case "Ocean":
                return Ocean.getInstance();
            case "Pastel":
                return Pastel.getInstance();
            case "Sunset":
                return Sunset.getInstance();
            default:
            case "Classic":
                return instance;
        }
    }
}
