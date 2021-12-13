package clases;

public class Smartdevice {
    protected String marca;
    protected String modelo;
    protected int year;
    protected boolean alarma;
    protected boolean chat;
    protected double cronometro = 0.0D;
    protected Internet internet;

    public Smartdevice() {
    }

    public Smartdevice(String marca, String modelo, int year, boolean alarma, boolean chat) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.alarma = alarma;
        this.chat = chat;
    }

    public Smartdevice(String marca, String modelo, int year, boolean alarma, boolean chat, double cronometro, Internet internet) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.alarma = alarma;
        this.chat = chat;
        this.cronometro = cronometro;
        this.internet = internet;
    }
}