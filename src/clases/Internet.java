package clases;

public class Internet {
    boolean wifi;
    int iP;
    boolean red5G;

    //constructor vacio
    public Internet() {
    }

    // constructor con parametros
    public Internet(boolean wifi, int iP, boolean red5G) {
        this.wifi = wifi;
        this.iP = iP;
        this.red5G = red5G;
    }

    public String valoresInternet() {
        return this.wifi + " " + this.iP + " " + this.red5G;
    }
}